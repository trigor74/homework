package com.itrifonov.homework;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class Task6Activity extends AppCompatActivity
        implements Task6ListFragment.OnListItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task6);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        // clear fragments BackStack
        fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (savedInstanceState == null) {
            Task6ListFragment listFragment = new Task6ListFragment();
            transaction.add(R.id.task6_content, listFragment);
        }
        if (findViewById(R.id.task6_info) != null) {
            Task6InfoFragment infoFragment = (Task6InfoFragment) fragmentManager.findFragmentById(R.id.task6_info);
            if (infoFragment == null) {
                infoFragment = new Task6InfoFragment();
                transaction.add(R.id.task6_info, infoFragment);
            }
        }
        transaction.commit();
    }

    @Override
    public void onListItemSelected(int position) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (findViewById(R.id.task6_info) != null) {
            Task6InfoFragment infoFragment = (Task6InfoFragment) fragmentManager.findFragmentById(R.id.task6_info);
            if (infoFragment != null)
                infoFragment.updateInfoView(position);
        } else {
            Task6InfoFragment infoFragment = new Task6InfoFragment();
            Bundle args = new Bundle();
            args.putInt(Task6InfoFragment.ARG_POSITION, position);
            infoFragment.setArguments(args);
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.task6_content, infoFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                FragmentManager fragmentManager = getSupportFragmentManager();
                if (fragmentManager.getBackStackEntryCount() > 0) {
                    fragmentManager.popBackStack();
                } else {
                    finish();
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

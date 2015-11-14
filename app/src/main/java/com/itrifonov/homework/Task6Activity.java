package com.itrifonov.homework;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class Task6Activity extends AppCompatActivity {
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

        if (findViewById(R.id.task6_info) != null) {
            if (savedInstanceState == null) {

                Task6ListFragment listFragment = new Task6ListFragment();
                Task6InfoFragment infoFragment = new Task6InfoFragment();

//                listFragment.setArguments(getIntent().getExtras());
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.add(R.id.task6_list, listFragment);
                transaction.add(R.id.task6_info, infoFragment);
                transaction.commit();

            }
        } else {
            if (savedInstanceState == null) {
                Task6ListFragment listFragment = new Task6ListFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().add(R.id.task6_content, listFragment).commit();
            }
        }
    }
}

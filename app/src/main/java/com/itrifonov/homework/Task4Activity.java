package com.itrifonov.homework;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.itrifonov.homework.interfaces.INavigation;

public class Task4Activity extends BaseActivity implements INavigation {

    final static String FRAGMENT_PREVIOUS = "PREVIOUS";
    final static String FRAGMENT_NEXT = "NEXT";

    @Override
    protected boolean isAddFragment() {
        // TODO: 27.10.2015 add logic
        return true;
    }

    @Override
    protected void addFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        // TODO: 30.10.2015 add check already added fragment
        fragmentManager.beginTransaction().add(R.id.task4_navigation_layout, new NavigationFragment()).commit();
    }

    @Override
    public void showPrevious() {
        Toast.makeText(this, "Previous button pressed", Toast.LENGTH_SHORT).show();
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment myFragment = fragmentManager.findFragmentByTag(FRAGMENT_PREVIOUS);
        if (myFragment == null)
            myFragment = new PreviousFragment();
        if (fragmentManager.findFragmentByTag(FRAGMENT_NEXT) != null)
            fragmentManager.beginTransaction().replace(R.id.task4_container_layout, myFragment, FRAGMENT_PREVIOUS).commit();
        else if (fragmentManager.findFragmentByTag(FRAGMENT_PREVIOUS) == null)
            fragmentManager.beginTransaction().add(R.id.task4_container_layout, myFragment, FRAGMENT_PREVIOUS).commit();
    }

    @Override
    public void showNext() {
        Toast.makeText(this, "Next button pressed", Toast.LENGTH_SHORT).show();
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment myFragment = fragmentManager.findFragmentByTag(FRAGMENT_NEXT);
        if (myFragment == null)
            myFragment = new NextFragment();
        if (fragmentManager.findFragmentByTag(FRAGMENT_PREVIOUS) != null)
            fragmentManager.beginTransaction().replace(R.id.task4_container_layout, myFragment, FRAGMENT_NEXT).commit();
        else if (fragmentManager.findFragmentByTag(FRAGMENT_NEXT) == null)
            fragmentManager.beginTransaction().add(R.id.task4_container_layout, myFragment, FRAGMENT_NEXT).commit();
    }
}

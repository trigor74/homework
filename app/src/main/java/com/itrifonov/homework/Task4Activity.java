package com.itrifonov.homework;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.itrifonov.homework.interfaces.INavigation;

public class Task4Activity extends BaseActivity implements INavigation {

    @Override
    public boolean isAddFragment() {
        return true;
    }

    @Override
    protected void addFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.task4_navigation_layout, new NavigationFragment()).commit();
    }

    @Override
    public void showPrevious() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment myFragment = new PreviousFragment();
        fragmentManager.beginTransaction().replace(R.id.task4_container_layout, myFragment).commit();
    }

    @Override
    public void showNext() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment myFragment = new NextFragment();
        fragmentManager.beginTransaction().replace(R.id.task4_container_layout, myFragment).commit();
    }
}

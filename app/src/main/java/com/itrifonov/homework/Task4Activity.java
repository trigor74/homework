package com.itrifonov.homework;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class Task4Activity extends BaseActivity {

    @Override
    protected boolean isAddFragment() {
        // TODO: 27.10.2015 add logic
        return true;
    }

    @Override
    protected void addFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.task4_main_layout, new NavigationFragment()).commit();
    }
}

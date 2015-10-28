package com.itrifonov.homework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

abstract public class BaseActivity extends AppCompatActivity {

    abstract protected boolean isAddFragment();
    abstract protected void addFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (isAddFragment()) {
            setContentView(R.layout.activity_task4);
            addFragment();
        } else {
            setContentView(R.layout.activity_task4);
        }
    }

}
package com.itrifonov.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_task1).setOnClickListener(this);
        findViewById(R.id.btn_task2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_task1:
                startActivity(new Intent(this, Task1Activity.class));
                break;
            case R.id.btn_task2:
                startActivity(new Intent(this, Task2Activity.class));
                break;
        }
    }
}

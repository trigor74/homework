package com.itrifonov.homework;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Task5Activity extends AppCompatActivity implements View.OnClickListener {

    private Animation animation;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task5);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        findViewById(R.id.btn_animate).setOnClickListener(this);

        imageView = (ImageView) findViewById(R.id.img_animate);
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.task5_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.animation1:
                item.setChecked(true);
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
                return true;
            case R.id.animation2:
                item.setChecked(true);
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
                return true;
            case R.id.animation3:
                item.setChecked(true);
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                return true;
            case R.id.animation4:
                item.setChecked(true);
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_animate:
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animation);
        }
    }
}

package com.itrifonov.homework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

abstract public class BaseActivity extends AppCompatActivity {

    abstract protected boolean isAddFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (isAddFragment()){
            /* устанавливаем layout9 в который добавляем фрагмент
            и для добавления фрагмента вызываем метод addFragment. */
            // TODO: 27.10.2015 add logic
            setContentView(R.layout.activity_task4);
            addFragment();
        } else {
            /* устанавливаем layout без фрагмента */
            // TODO: 27.10.2015 add logic
            setContentView(R.layout.activity_task4);
        }
    }

    private void addFragment () {
        // TODO: 27.10.2015 add logic
        /* добавляем фрагмент */
    }
}

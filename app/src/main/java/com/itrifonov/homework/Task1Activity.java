package com.itrifonov.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Task1Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        Button touchMe = (Button) findViewById(R.id.btn_say_hello);
        touchMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Task1Activity.this, AcquaintanceActivity.class);
                startActivity(intent);
            }
        });
    }
}

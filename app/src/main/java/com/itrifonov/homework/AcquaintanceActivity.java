package com.itrifonov.homework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AcquaintanceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acquaintance);

        Button btnIntroduce = (Button) findViewById(R.id.btn_introduce_myself);
        btnIntroduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText) findViewById(R.id.edit_name);
                String hello = String.format(getString(R.string.str_hello_smb), name.getText());
                TextView textHelloSmb = (TextView) findViewById(R.id.txt_hello_smb);
                textHelloSmb.setText(hello);
            }
        });
    }
}

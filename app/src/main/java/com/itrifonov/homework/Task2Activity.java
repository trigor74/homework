package com.itrifonov.homework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Task2Activity extends AppCompatActivity {

    public static long fibonacci(int n) {
        /*
        if (n <= 0) return 0L;
        long f0 = 0L;
        long f1 = 1L;
        long result = 1L;
        for (int i = 0; i < n - 1; i++) {
            result = f0 + f1;
            f0 = f1;
            f1 = result;
        }
        return result;
         */
        //Binet's expression
        return Math.round((Math.pow(1.61803398875, (double) n) - Math.pow(-0.61803398875, (double) n)) / 2.2360679775);
    }

    public static long factorial(int n) {
        long result = 1;
        while (n > 1) {
            result *= n--;
        }
        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        Button calc = (Button) findViewById(R.id.btn_calculate);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText number = (EditText) findViewById(R.id.edit_number);
                int n = Integer.valueOf(number.getText().toString());

                TextView txtFibonacci = (TextView) findViewById(R.id.txt_fibonacci);
                long fib;
                fib = fibonacci(n);
                txtFibonacci.setText(String.format(getString(R.string.str_fibonacci), n, fib));

                TextView txtFactorial = (TextView) findViewById(R.id.txt_factorial);
                long fac;
                fac = factorial(n);
                txtFactorial.setText(String.format(getString(R.string.str_factorial), n, fac));
            }
        });
    }
}

package com.itrifonov.homework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Task2Activity extends AppCompatActivity {

    public static long fibonacci(int n) {
        if (n <= 0) return 0L;
        else if (n == 1) return 1L;
        else {
            long f0 = 0L;
            long f1 = 1L;
            long result = 1L;
            for (int i = 0; i < n - 1; i++) {
                result = f0 + f1;
                f0 = f1;
                f1 = result;
            }
            return result;
        }
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
    }
}

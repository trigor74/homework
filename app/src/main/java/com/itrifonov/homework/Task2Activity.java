package com.itrifonov.homework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class Task2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        Button calc = (Button) findViewById(R.id.btn_calculate);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtFibonacci = (TextView) findViewById(R.id.txt_fibonacci);
                txtFibonacci.setText("");
                TextView txtFactorial = (TextView) findViewById(R.id.txt_factorial);
                txtFactorial.setText("");

                EditText number = (EditText) findViewById(R.id.edit_number);
                int n;
                try {
                    n = Integer.valueOf(number.getText().toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    if (number.getText().toString().isEmpty())
                        txtFibonacci.setText(getString(R.string.str_enter_number));
                    else
                        txtFibonacci.setText(String.format(getString(R.string.str_error), e.getMessage()));
                    return;
                }

                long fib;
                try {
                    fib = fibonacci(n);
                    txtFibonacci.setText(String.format(getString(R.string.str_fibonacci), n, fib));
                } catch (Exception e) {
                    e.printStackTrace();
                    txtFibonacci.setText(String.format(getString(R.string.str_err_fibonacci), e.getMessage()));
                }

                long fac;
                try {
                    fac = factorial(n);
                    txtFactorial.setText(String.format(getString(R.string.str_factorial), n, fac));
                } catch (Exception e) {
                    e.printStackTrace();
                    txtFactorial.setText(String.format(getString(R.string.str_err_factorial), e.getMessage()));
                }
            }
        });
    }

    public static long fibonacci(int n) throws Exception {
        if (n < 0)
            throw new IllegalArgumentException("Illegal argument");
        //Binet's expression for calculating the Fibonacci sequence
        double d = (Math.pow(1.61803398875, (double) n) - Math.pow(-0.61803398875, (double) n)) / 2.2360679775;
        if (d > Long.MAX_VALUE)
            throw new ArithmeticException("Integer overflow: The number is too large to calculate");
        return Math.round(d);
    }

    public static long factorial(int n) throws Exception {
        if (n < 0)
            throw new IllegalArgumentException("Illegal argument");
        long result = 1;
        BigInteger test = BigInteger.ONE;
        while (n > 1) {
            test = test.multiply(BigInteger.valueOf(n));
            if (test.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) == 1)
                throw new ArithmeticException("Integer overflow: The number is too large to calculate");
            result *= n--;
        }
        return result;
    }
}

package com.itrifonov.homework;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Task3Activity extends AppCompatActivity implements View.OnClickListener {

    private String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
            "Blackberry", "Ubuntu", "Windows7", "Mac OS X", "Linux", "Ubuntu", "Windows7",
            "Mac OS X", "Linux", "Ubuntu", "Windows7", "Android", "iPhone", "WindowsMobile" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);

        createAndShowNumbers();

        findViewById(R.id.button_1).setOnClickListener(this);
        findViewById(R.id.button_2).setOnClickListener(this);
        findViewById(R.id.button_3).setOnClickListener(this);
        findViewById(R.id.button_4).setOnClickListener(this);
    }

    private void createAndShowNumbers() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }

        String strings = TextUtils.join(", ", list);

        TextView text1 = (TextView) findViewById(R.id.text_1);
        text1.setText(strings);
    }

    private void reverseOrder() {
        TextView text2 = (TextView) findViewById(R.id.text_2);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(values));
        Collections.reverse(arrayList);

        text2.setText(arrayList.toString());
    }

    private void removeEveryThird() {
        TextView text2 = (TextView) findViewById(R.id.text_2);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(values));

        int i=2;
        while (i < arrayList.size()) {
            arrayList.remove(i);
            i += 2;
        }

        text2.setText(arrayList.toString());
    }

    private void removeDuplicates() {
        TextView text2 = (TextView) findViewById(R.id.text_2);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(values));

        text2.setText(hashSet.toString());
    }

    private void sortValues() {
        TextView text2 = (TextView) findViewById(R.id.text_2);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(values));
        Collections.sort(linkedList, String.CASE_INSENSITIVE_ORDER);

        text2.setText(linkedList.toString());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                reverseOrder();
                break;
            case R.id.button_2:
                removeEveryThird();
                break;
            case R.id.button_3:
                removeDuplicates();
                break;
            case R.id.button_4:
                sortValues();
                break;
        }
    }
}

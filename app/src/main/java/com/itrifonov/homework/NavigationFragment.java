package com.itrifonov.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class NavigationFragment extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_task4_navigation, container, false);

        Button prev = (Button) view.findViewById(R.id.btn_previous);
        Button next = (Button) view.findViewById(R.id.btn_next);
        prev.setOnClickListener(this);
        next.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_previous:
                Toast.makeText(getActivity(), "Previous button pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_next:
                Toast.makeText(getActivity(), "Next button pressed", Toast.LENGTH_SHORT).show();
                break;
        }
    }


}

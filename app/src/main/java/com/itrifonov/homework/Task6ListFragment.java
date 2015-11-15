package com.itrifonov.homework;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6ListFragment extends Fragment {

    private ListView mListView;
    private ArrayAdapter<String> mAdapter;

    public interface OnListItemSelectedListener {
        void onListItemSelected (int position);
    }

    private OnListItemSelectedListener mCallback;
    private ArrayList<String> mSourceList = new ArrayList<>();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mCallback = (OnListItemSelectedListener) context;
        } catch(ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_task6_list, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mSourceList.clear();
        mSourceList.addAll(Arrays.asList(getResources().getStringArray(R.array.task6_items_list)));
        mAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, mSourceList);
        mListView = (ListView) getActivity().findViewById(R.id.task6_list_view);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mCallback.onListItemSelected(position);
            }
        });
    }
}
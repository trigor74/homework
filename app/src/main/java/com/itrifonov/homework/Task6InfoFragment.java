package com.itrifonov.homework;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Task6InfoFragment extends Fragment {

    public static String ARG_POSITION = "INDEX";
    private int mIndex;
    private ImageView mImage;
    private TextView mName;
    private TextView mDescription;
    private TypedArray mArrayImagesIDs;
    private String[] mArrayName;
    private String[] mArrayDescription;

    public void updateInfoView (int index) {
        mIndex = index;
        if (mImage != null) {
            mImage.setImageResource(mArrayImagesIDs.getResourceId(mIndex, -1));
            mName.setText(mArrayName[mIndex]);
            mDescription.setText(mArrayDescription[mIndex]);
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null && getArguments().containsKey(ARG_POSITION)) {
            mIndex = getArguments().getInt(ARG_POSITION, 0);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
        View view = inflater.inflate(R.layout.fragment_task6_info, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mImage = (ImageView) getActivity().findViewById(R.id.task6_image_view);
        mName = (TextView) getActivity().findViewById(R.id.task6_txt_name);
        mDescription = (TextView) getActivity().findViewById(R.id.task6_txt_description);

        mArrayImagesIDs = getResources().obtainTypedArray(R.array.task6_items_image);
        mArrayName = getResources().getStringArray(R.array.task6_items_list);
        mArrayDescription = getResources().getStringArray(R.array.task6_items_description);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        updateInfoView(mIndex);
    }
}

package com.company.scrollabletabs.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.company.scrollabletabs.R;

/**
 * Created by niraj.markandey on 19/10/17.
 */

public class OneFragment extends Fragment {
    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String nameText=getArguments().getString("name");
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        TextView name = (TextView) rootView.findViewById(R.id.name);
        name.setText(nameText);
        return rootView;
    }
}

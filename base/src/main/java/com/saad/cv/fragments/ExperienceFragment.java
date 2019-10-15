package com.saad.cv.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.saad.cv.adapters.ExperienceAdapter;
import com.saad.cv.base.R;

public class ExperienceFragment extends Fragment {
    String [] str={"Teacher\nInstitute:\nPerfect Academy\nTaught:\n9th, 10th, 11th, 12th"
            ,"Teacher\nInstitute:\nStars Academy\nTaught:\n9th, 10th, 11th, 12th"};
    public ExperienceFragment() {
        // Required empty public constructor
    }
    public static ExperienceFragment newInstance() {
        ExperienceFragment fragment = new ExperienceFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment4, container, false);
        RecyclerView recyclerViewDemo = view.findViewById(R.id.recyclerViewDemo4);
        recyclerViewDemo.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewDemo.setAdapter(new ExperienceAdapter(str));
        return view;
    }

}

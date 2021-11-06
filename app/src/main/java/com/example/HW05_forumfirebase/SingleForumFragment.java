package com.example.HW05_forumfirebase;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.inclass08_forumfirebase.R;
import com.example.inclass08_forumfirebase.databinding.FragmentSingleForumBinding;

public class SingleForumFragment extends Fragment {

    FragmentSingleForumBinding binding;

    public SingleForumFragment(POJOclasses.Forum forum) {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSingleForumBinding.inflate(inflater, container, false);
        return inflater.inflate(R.layout.fragment_single_forum, container, false);
    }
}
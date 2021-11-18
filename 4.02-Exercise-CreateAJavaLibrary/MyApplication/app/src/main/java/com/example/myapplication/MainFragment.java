package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.jokewizard.JokeWizard;
import com.example.lib.JokeSmith;

public class MainFragment extends Fragment {

    public MainFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ((TextView) rootView.findViewById(R.id.fragment_main_text_view))
                .setText( new JokeSmith().getJoke());

        ((TextView) rootView.findViewById(R.id.fragment_main_from_wizard_text_view))
                .setText( new JokeWizard().getJoke());



        return rootView;
    }
}

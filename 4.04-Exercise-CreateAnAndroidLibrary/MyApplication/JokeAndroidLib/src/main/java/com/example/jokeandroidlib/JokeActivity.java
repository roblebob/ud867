package com.example.jokeandroidlib;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;

public class JokeActivity extends AppCompatActivity {
    public static final String TAG = JokeActivity.class.getSimpleName();

    String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);


        if (savedInstanceState == null) {

            String mJoke = getIntent().getStringExtra(JokeFragment.ARG_JOKE);

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.activity_joke_fragment_container, JokeFragment.newInstance( mJoke))
                    .commit();

        } else {
            mJoke = savedInstanceState.getString( JokeFragment.ARG_JOKE);
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString( JokeFragment.ARG_JOKE, mJoke);
        super.onSaveInstanceState(outState);
    }
}
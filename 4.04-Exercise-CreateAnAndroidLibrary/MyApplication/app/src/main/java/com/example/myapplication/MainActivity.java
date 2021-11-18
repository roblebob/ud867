package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.jokeandroidlib.JokeActivity;
import com.example.jokeandroidlib.JokeFragment;
import com.example.jokejavalib.Joke;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnCLick(View view) {
        Intent intent = new Intent( this, JokeActivity.class);
        intent.putExtra( JokeFragment.ARG_JOKE, new Joke().getJoke());
        startActivity(intent);
    }
}
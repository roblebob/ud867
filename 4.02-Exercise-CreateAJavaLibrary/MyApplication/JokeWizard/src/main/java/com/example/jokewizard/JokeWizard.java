package com.example.jokewizard;

import com.example.lib.JokeSmith;

public class JokeWizard {
    public String getJoke() {
        return new JokeSmith().getJoke() + "\n(from Wizard)";
    }
}
package com.example.android.clickcounter;


import org.junit.Test;

public class ClickCounterTest {

    @Test
    public void verifyClickCounterResponse() {

        ClickCounter clickCounter = new ClickCounter();

        for (int i = 0; i < 10; i++) {

            assert clickCounter.getCount() == i;
            clickCounter.increment();
        }

    }

}

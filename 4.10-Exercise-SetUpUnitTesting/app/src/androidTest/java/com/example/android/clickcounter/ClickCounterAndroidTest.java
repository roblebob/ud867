package com.example.android.clickcounter;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4; 

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ClickCounterAndroidTest {

    @Rule
    public ActivityScenarioRule<ClickActivity> mActivityTestRule = new ActivityScenarioRule<>(ClickActivity.class);

    @Test
    public void verifyIncrementButtonResponse() {

        for (int i = 0; i < 10; i++) {

            onView(withId(R.id.click_count_text_view)).check( matches( withText( String.valueOf(i))));

            onView(withId(R.id.click_button)).perform(click());
        }
    }

}

package com.example.javaexpressoui;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule= new ActivityTestRule<>(MainActivity.class);



    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void expressoTestJava() throws Exception{
        //Espresso.onView(withId(R.id.textVal));
        //This will performed only if you launched the activity , without activity launch can perform just
        // above task but not the below tak means click one
        //Espresso.onView(withId(R.id.button)).perform(click());

        Espresso.onView(withId(R.id.username)).perform(typeText("Ashish")).check(matches(withText("Ashish")));
        Espresso.onView(withId(R.id.userpass)).perform(typeText("12345")).check(matches(withText("12345")));
        Espresso.onView(withId(R.id.button)).perform(click());

    }


    @After
    public void tearDown() throws Exception {
    }
}
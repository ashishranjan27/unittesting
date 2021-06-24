package com.example.activitytestcase;

import android.widget.EditText;
import android.widget.TextView;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    private MainActivity mainActivity;
    private TextView textView;
    private EditText editText;

    @Rule
    //launch the activity
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception {
        //get the activity
        mainActivity= activityActivityTestRule.getActivity();
        textView = mainActivity.findViewById(R.id.textone);
    }

    @Test
    public void doingTest()
    {
        editText = mainActivity.findViewById(R.id.editone);
      //  assertEquals("Ashish",textView.getText().toString());
        assertEquals("Ranjan",editText.getText().toString());
    }


    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }
}
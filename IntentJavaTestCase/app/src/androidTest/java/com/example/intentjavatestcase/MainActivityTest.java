package com.example.intentjavatestcase;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.Intents.intending;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public IntentsTestRule<MainActivity> intentsTestRule = new IntentsTestRule<>(MainActivity.class);  //Method 1

    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);    //Method 2


    @Test
    public void intenttestjava() throws InterruptedException {

        //click will be performed after launching  intent
        //sending without any value
     /* Thread.sleep(2000);
        onView(withId(R.id.senddata)).perform(click());                //Method 1
        Thread.sleep(2000);
        intended(hasComponent(SecondActivity.class.getName()));       //Method 1
        Thread.sleep(2000);   */

        /* Thread.sleep(3000);
         onView(withId(R.id.senddata)).perform(click());    //Method 2
         Thread.sleep(3000);
         Intent i = new Intent();            //Method 2
         Thread.sleep(3000);
         mainActivityActivityTestRule.launchActivity(i);     //Method 2
         Thread.sleep(3000);*/

        //Want some response back then use intending
        Thread.sleep(2000);
        onView(withId(R.id.senddata)).perform(click());        //method 3
        Thread.sleep(2000);
            Intent i = new Intent();                                //method 3
        Thread.sleep(2000);
          i.putExtra("name","Ashish Ranjan");       //method 3
        //whenever have putextra and want to check intenting behaviour
        Instrumentation.ActivityResult result = new Instrumentation.ActivityResult(Activity.RESULT_OK,i);     //method 3
        Thread.sleep(2000);
           intending(toPackage(SecondActivity.class.getName())).respondWith(result);      //method 3
        Espresso.pressBack();                               //method 3
        Espresso.closeSoftKeyboard();                       //method 3
        Thread.sleep(2000);                          //method 3
        onView(withId(R.id.senddata1)).perform(click());    //method 3
        Thread.sleep(2000);              //method 3
    }
}
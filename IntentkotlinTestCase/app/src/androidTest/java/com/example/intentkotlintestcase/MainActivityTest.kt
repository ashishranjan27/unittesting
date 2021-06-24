package com.example.intentkotlintestcase

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.Intents.intending
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.matcher.IntentMatchers.toPackage
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @Rule
    @JvmField
    public var intenttestrule = IntentsTestRule(MainActivity::class.java)  //method 1
    public var activitytestrule = ActivityTestRule(MainActivity::class.java)   //method 2


    @Before
    fun setUp() {

    }

    @Test
    fun chekintent(){
          //Thread.sleep(3000)
          //Espresso.onView(withId(R.id.sendbutton1)).perform(click())     //method 1
          //Thread.sleep(3000)
          //intended(hasComponent(SecondActivity::class.java.name))       //method 1


        /*
        Thread.sleep(2000)                                                //method2
        Espresso.onView(withId(R.id.sendbutton1)).perform(click())         //method2
        Thread.sleep(2000)                                               //method2
         val intent = Intent()                                            //method2
        Thread.sleep(2000)                                             //method2
         activitytestrule.launchActivity(intent)                          //method2
        Thread.sleep(2000)                                             //method2
        */


        Thread.sleep(2000)                                          //method 3
        Espresso.onView(withId(R.id.sendbutton1)).perform(click())         //method 3
        //Thread.sleep(2000)                                          //method 3
        val intent = Intent()                                            //method 3
        intent.putExtra("name","Ranjan")                   //method 3
        //Thread.sleep(2000)                                         //method 3
        val instrumentalresult: Instrumentation.ActivityResult =  Instrumentation.ActivityResult (Activity.RESULT_OK,intent)    //method 3
       // Thread.sleep(2000)                                          //method 3
        intending(toPackage(SecondActivity::class.java.name)).respondWith(instrumentalresult)

        Espresso.pressBack()
        Espresso.closeSoftKeyboard()
        Thread.sleep(3000)
        Espresso.onView(withId(R.id.sendbutton2)).perform(click())

    }
}
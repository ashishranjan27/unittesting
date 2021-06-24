package com.example.kotlinuitest


import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {


    @Rule
    @JvmField
    //choose below one or below to below one both are same (line no 19 and 20)
    public val activityTestRule = ActivityTestRule(MainActivity::class.java)
  //  public val activityTestRule : ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)


    @Before
    fun setUp() {


    }



    @Test
    fun expressoUiTest(){
        //Thread.sleep(1000)
      //  Espresso.onView((withId(R.id.textval)))
//        Thread.sleep(2000)
//        Espresso.onView(withId(R.id.buttonval)).perform(click())
        Thread.sleep(2000)
        Espresso.onView(withId(R.id.nameval)).perform(typeText("Ashish Ranjan")).check(matches(withText("AshishRanjan")))
        Thread.sleep(2000)
        Espresso.onView(withId(R.id.passval)).perform(typeText("123456")).check(matches(withText("123456")))
        Thread.sleep(2000)
        Espresso.onView(withId(R.id.buttonval)).perform(click())

    }

}
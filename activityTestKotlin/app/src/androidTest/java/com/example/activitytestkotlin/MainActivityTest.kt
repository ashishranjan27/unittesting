package com.example.activitytestkotlin

import android.widget.TextView
import androidx.test.rule.ActivityTestRule
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @Rule
    @JvmField
    //launch the activity
    var activityTestRule = ActivityTestRule(MainActivity::class.java)


    lateinit var activity: MainActivity

    @Before
    fun setUp() {
         //get the activity
        activity = activityTestRule.activity
       // var textview:TextView = activity.findViewById(R.id.textviewname)

    }

    @Test
    fun testactivity(){
        //assertEquals("Ashish", textview1.text.toString())
        //assertEquals("Ashish",textview.text.toString())

      //   var edit:TextView = activity.findViewById(R.id.textviewname);
        // var s = edit.text.toString();
         //assertEquals("Ashish",s)

        assertEquals("Ashish Ranjan", activity.add("Ashish ","Ranjan"))

    }



    @After
    fun tearDown() {

    }
}
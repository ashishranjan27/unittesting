package com.example.activitytestkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var l:TextView= R.id.textviewname.text.toString();
        //var edit:TextView = findViewById(R.id.textviewname);
       // var s = edit.text.toString();
    }

    public fun add(name1:String , name2 : String) : String
    {
        var addition = name1 + name2;
        return addition;
    }
}
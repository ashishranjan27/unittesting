package com.example.intentkotlintestcase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sendbutton1: Button =  findViewById(R.id.sendbutton1);
        var sendbutton2: Button =  findViewById(R.id.sendbutton2);
        sendbutton1.setOnClickListener(View.OnClickListener
        {
            val intent= Intent(this,SecondActivity::class.java)
            intent.putExtra("name","Ranjan")    //for method 3 else comment this
            startActivity(intent)
        })

        val textval:TextView = findViewById(R.id.textval)
        sendbutton2.setOnClickListener(View.OnClickListener {
            textval.visibility = View.VISIBLE
        })


    }
}
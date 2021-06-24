package com.example.activitytestcase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Tag","Ashish is good boy");
        Log.e("Tag","nahi nahi");
        Log.i("Tag","oh no bro");
        Log.v("Tag","now the turn of the verbose megthod");
        try {
            int a=10/0;
            //do something
        } catch (Exception e) {
            Log.d("Tag", "General Exception:\n", e);
        }

    }
}
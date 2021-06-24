package com.example.uitestexpresso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnChange;
    private EditText etTextToChange;
    private TextView tvChangedText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChange =  findViewById(R.id.btnChange);

        etTextToChange =  findViewById(R.id.etTextToChange);

        tvChangedText =  findViewById(R.id.tvChangedText);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvChangedText.setText(etTextToChange.getText());
            }
        });

    }
}
package com.example.tutorial04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView uname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        uname = findViewById(R.id.txtuname);
        String user = getIntent().getStringExtra("username");
        uname.setText("Welcome "+user);
    }
}
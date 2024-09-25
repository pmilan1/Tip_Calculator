package com.example.tipcalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText totalET, tipET;
    private Button calculateBtn;
    private CheckBox roundBox;
    private TextView totalTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalET = setContentView(R.id.totalEditText);
        tipET = setContentView(R.id.tipEditText);
        calculateBtn= setContentView(R.id.calculateBtn);
        roundBox = setContentView(R.id.roundBox);
        totalTV = setContentView(R.id.totalTextView);
    }
}
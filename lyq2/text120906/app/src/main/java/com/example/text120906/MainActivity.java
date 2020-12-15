package com.example.text120906;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.icu.text.StringPrepParseException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgreeDailog progreeDailog=new ProgressDialog(MainActivity.this);
                progreeDailog.

            }
        });
    }
}
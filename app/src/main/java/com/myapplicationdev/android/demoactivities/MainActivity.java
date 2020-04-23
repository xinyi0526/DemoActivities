package com.myapplicationdev.android.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDone = (Button) findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText etName = (EditText) findViewById(R.id.editTextName);
                EditText etAge = (EditText) findViewById(R.id.editTextAge);
                String[] info = {etName.getText().toString(),etAge.getText().toString()};
                Intent i = new Intent(MainActivity.this,DemoActivities2.class);
                i.putExtra("info",info);
                startActivity(i);
            }
        });
    }
}

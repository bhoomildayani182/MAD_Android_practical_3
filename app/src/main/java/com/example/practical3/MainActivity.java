package com.example.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText no1, no2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = findViewById(R.id.no1);
        no2 = findViewById(R.id.no2);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x=Integer.parseInt(no1.getText().toString());
                int y=Integer.parseInt(no2.getText().toString());

                int z = x + y;
                Toast.makeText(MainActivity.this, "Total Sum is " + z, Toast.LENGTH_SHORT).show();
            }

        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Start","Activity Start");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("End","Activity Terminated");

    }
}
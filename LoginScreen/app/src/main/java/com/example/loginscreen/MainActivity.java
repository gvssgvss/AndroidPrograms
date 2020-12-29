package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.editTextTextPersonName);
        et2 = findViewById(R.id.editTextTextPassword);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String s = et1.getText().toString();
                 String s1 = et2.getText().toString();
                 if (s.equals("edureka") && s1.equals("edureka123")){
                     Toast.makeText(MainActivity.this, "Sucess", Toast.LENGTH_SHORT).show();
                     b1.setEnabled(false);
                 }else {
                     Toast.makeText(MainActivity.this, "Wrong Details", Toast.LENGTH_SHORT).show();
                     b1.setEnabled(true);
                 }
            }
        });
    }
}
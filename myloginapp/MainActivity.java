package com.example.myloginapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure this is the correct layout file

        // Get references to the views
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        MaterialButton loginbtn = findViewById(R.id.loginbtn);

        // Set the click listener for the login button
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                // Validate login credentials
                if (user.equals("admin") && pass.equals("admin")) {
                    // Correct credentials
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                } else {
                    // Incorrect credentials
                    Toast.makeText(MainActivity.this, "LOGIN FAILED!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

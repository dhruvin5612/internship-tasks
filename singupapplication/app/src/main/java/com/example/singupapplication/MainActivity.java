package com.example.singupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName,etEmail, etPassword, etNumber;
    Button bunSignup;

    public static final String main_key = "mymain";
    public static final String name_key = "myname";
    public static final String email_key = "myemail";
    public static final String password_key = "mypassword";
    public static final String contact_key = "mycontact";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.Name);
        etEmail = findViewById(R.id.Email);
        etPassword = findViewById(R.id.Password);
        etNumber = findViewById(R.id.Number);
        bunSignup = findViewById(R.id.btn);


        bunSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String name, email, password, number;
                 name = etName.getText().toString();
                 email = etEmail.getText().toString();
                 password = etPassword.getText().toString();
                 number = etNumber.getText().toString();
                 if(name==null || email==null || password==null || number==null){
                     Toast.makeText(MainActivity.this, "please fill the form...", Toast.LENGTH_SHORT).show();
                 }else {

                     SharedPreferences preferences = getSharedPreferences(main_key, MODE_PRIVATE);
                     SharedPreferences.Editor editor = preferences.edit();
                     editor.putString("name_key", "name");
                     editor.putString("name_email", "email");
                     editor.putString("name_password", "password");
                     editor.putString("name_number", "number");
                     editor.commit();

                     Intent intent = new Intent(MainActivity.this, Signup.class);
                     startActivity(intent);
                 }
            }
        });
    }
}
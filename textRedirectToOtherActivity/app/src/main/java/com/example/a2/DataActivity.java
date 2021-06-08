package com.example.a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    TextView name, password, phone, email, hobbies, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);


        name = findViewById(R.id.name);
        gender =  findViewById(R.id.gender);
        email =  findViewById(R.id.email);
        phone =  findViewById(R.id.phone);
        password =  findViewById(R.id.password);
        hobbies =  findViewById(R.id.hobbies);

        String name1 = getIntent().getStringExtra("Name2");
        String gender1 = getIntent().getStringExtra("Gender2");
        String email1 = getIntent().getStringExtra("Email2");
        String phone1 = getIntent().getStringExtra("Phone2");
        String password1 = getIntent().getStringExtra("Password2");
        String hobbies1 = getIntent().getStringExtra("Hobbies2");

        name.setText(name1);
        gender.setText(gender1);
        phone.setText(phone1);
        email.setText(email1);
        password.setText(password1);

        hobbies.setText(hobbies1);
    }
}
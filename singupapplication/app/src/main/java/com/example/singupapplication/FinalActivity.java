package com.example.singupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinalActivity extends AppCompatActivity {
    Button finalbtn;

    public static final String main_key = "mymain";
    public static final String name_key = "myname";
    public static final String email_key = "myemail";
    public static final String password_key = "mypassword";
    public static final String contact_key = "mycontact";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);


        finalbtn = findViewById(R.id.logout);

        finalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences  = getSharedPreferences(main_key,MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.clear();
                Intent intent = new Intent(FinalActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
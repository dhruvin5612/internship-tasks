package com.example.singupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    EditText signemail, signpassword;
    Button signbtn, signbtn2;

    public static final String main_key = "mymain";
    public static final String name_key = "myname";
    public static final String email_key = "myemail";
    public static final String password_key = "mypassword";
    public static final String contact_key = "mycontact";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signemail = findViewById(R.id.signEmail);
        signpassword = findViewById(R.id.signPassword);
        signbtn = findViewById(R.id.signbtn);
        signbtn2 =  findViewById(R.id.signbtn2);


        signbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sEmail , sPassword;
                sEmail = signemail.getText().toString();
                sPassword = signpassword.getText().toString();

                SharedPreferences preferences  = getSharedPreferences(main_key,MODE_PRIVATE);
                String uemail = preferences.getString(email_key,sEmail);
                String upassword = preferences.getString(email_key,sPassword);

                if(uemail.equals(sEmail) && upassword.equals(sPassword)){
                    Intent  intent = new Intent(Signup.this, FinalActivity.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(Signup.this, "username or password is worong....", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(Signup.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
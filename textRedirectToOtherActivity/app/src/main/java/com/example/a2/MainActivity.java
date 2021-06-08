package com.example.a2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


        EditText name,phone,email,hobbies,password,gender;
        Button btn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            name =  findViewById(R.id.name);
            phone =  findViewById(R.id.phone);
            email =  findViewById(R.id.email);
            gender=  findViewById(R.id.xender);
            hobbies =  findViewById(R.id.hobbies);
            password =  findViewById(R.id.password);
            btn =  findViewById(R.id.btn);


            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,DataActivity.class);
                    String Name= name.getText().toString();
                    String Gender=gender.getText().toString();
                    String Email= email.getText().toString();
                    String Phone= phone.getText().toString();
                    String Password= password.getText().toString();
                    String Hobbies= hobbies.getText().toString();



                    intent.putExtra("Name2",Name);
                    intent.putExtra("Gender2",Gender);
                    intent.putExtra("Email2",Email);
                    intent.putExtra("Phone2",Phone);
                    intent.putExtra("Password2",Password);
                    intent.putExtra("Hobbies2",Hobbies);
                    startActivity(intent);

                }
            });

        }
}
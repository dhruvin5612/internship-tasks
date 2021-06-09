package com.example.call_id;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.badge.BadgeUtils;

public class MainActivity extends AppCompatActivity {
    EditText num, smsnum, smstext ;
    Button btn, smsbtn;

//    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num  =  findViewById(R.id.num);
        btn = findViewById(R.id.btn);
        smsnum  =  findViewById(R.id.smsnum);
        smstext  =  findViewById(R.id.smstext);
        smsbtn  =  findViewById(R.id.smsbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = num.getText().toString();
                Intent  intent= new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:- "+ number));

                if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE)
                    != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(intent);
            }
        });

        //////////////////////////  for the sms contect /////////////////

        smsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no = smsnum.getText().toString();
                String sms = smstext.getText().toString();

                SmsManager smsText = SmsManager.getDefault();
                smsText.sendTextMessage(no,null,sms,null,null);
                Toast.makeText(getApplicationContext(),"Message send successfully ",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
package com.example.rattlerservices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    private Button btnFinanAid;
    private Button btnRegistrar;
    private Button btnStuHealth;
    private Button btnStuAccounts;
    private Button btnStuAffairs;
    private Button btnParking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFinanAid = findViewById(R.id.btnFinanAid);
        btnFinanAid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Financial Aid Page
            }
        });
        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Registrar Page
            }
        });
        btnStuHealth = findViewById(R.id.btnStuHealth);
        btnStuHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Student Health Page
            }
        });
        btnStuAccounts = findViewById(R.id.btnStuAccounts);
        btnStuAccounts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Student Accounts Page
            }
        });
        btnStuAffairs = findViewById(R.id.btnStuAffairs);
        btnStuAffairs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Student Affairs Page
            }
        });
        btnParking = findViewById(R.id.btnParking);
        btnParking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Parking Services Page
            }
        });
    }
}
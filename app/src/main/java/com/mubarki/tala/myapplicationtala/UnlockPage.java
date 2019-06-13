package com.mubarki.tala.myapplicationtala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UnlockPage extends AppCompatActivity {
    private Button btnPatients;
    private Button btnPharmacy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_name);
        btnPatients = (Button) findViewById(R.id.btnPatients);
        btnPharmacy = (Button) findViewById(R.id.btnPharmacy);
    }

    public void onClick(View v) {
        if (v == btnPatients) {

            Intent intent = new Intent(UnlockPage.this, PatientsList.class);
            startActivity(intent);
            finish();
        }


    }
    public void onClick1(View v)
    {
        if (v == btnPharmacy) {

            Intent intent = new Intent(UnlockPage.this, PharmacyList.class);
            startActivity(intent);
            finish();
        }
    }
}
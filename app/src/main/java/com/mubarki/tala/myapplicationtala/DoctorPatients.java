package com.mubarki.tala.myapplicationtala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class DoctorPatients extends AppCompatActivity {
    private Button btnAddPatients;
    private ListView lstdynamic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_patients);

        btnAddPatients = (Button) findViewById(R.id.btnAddPatients);
        lstdynamic = (ListView) findViewById(R.id.lstdynamic);
    }

    public void onClick(View v) {
        if (v == btnAddPatients) {

            Intent intent = new Intent(DoctorPatients.this, AddingPatients.class);
            startActivity(intent);
            finish();
        }
    }
}

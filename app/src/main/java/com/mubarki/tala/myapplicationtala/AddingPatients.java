package com.mubarki.tala.myapplicationtala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddingPatients extends AppCompatActivity {
    private TextView tv;
    private EditText etName;
    private EditText etId;
    private EditText etTherapy;
    private EditText etAllergy;
    private Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_patients);
        btnSave = (Button) findViewById(R.id.btnSave);
        tv = (TextView) findViewById(R.id.tv);
        etName = (EditText) findViewById(R.id.etName);
        etId = (EditText) findViewById(R.id.etId);
        etTherapy = (EditText) findViewById(R.id.etTherapy);
        etAllergy = (EditText) findViewById(R.id.etAllergy);
    }

    public void onClick(View v) {
        if (v == btnSave) {

            Intent intent = new Intent(AddingPatients.this, DoctorPatients.class);
            startActivity(intent);
            finish();
        }
    }

}

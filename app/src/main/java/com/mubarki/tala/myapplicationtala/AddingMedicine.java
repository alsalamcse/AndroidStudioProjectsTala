package com.mubarki.tala.myapplicationtala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddingMedicine extends AppCompatActivity {
    private TextView tv;
    private EditText etName;
    private EditText etResone;
    private EditText etPercent;
    private EditText etDamege;
    private Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_medicine);

        btnSave = (Button) findViewById(R.id.btnSave);
        tv = (TextView) findViewById(R.id.tv);
        etName = (EditText) findViewById(R.id.etName);
        etResone = (EditText) findViewById(R.id.etReasone);
        etPercent = (EditText) findViewById(R.id.etPercent);
        etDamege = (EditText) findViewById(R.id.etDamge);

    }

    public void onClick(View v) {
        if (v == btnSave) {

            Intent intent = new Intent(AddingMedicine.this, Pharmacy.class);
            startActivity(intent);
            finish();
        }
    }
}

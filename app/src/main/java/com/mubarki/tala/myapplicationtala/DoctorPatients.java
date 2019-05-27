package com.mubarki.tala.myapplicationtala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
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
       initListview();
    }

    public void onClick(View v) {
        if (v == btnAddPatients) {

            Intent intent = new Intent(DoctorPatients.this, AddingPatients.class);
            startActivity(intent);
            finish();
        }
    }
    private void initListview(){
        lstdynamic = (ListView) findViewById(R.id.lstdynamic);
        String[] a={"one","two","three"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,a );
        lstdynamic.setAdapter(adapter);
    }
}

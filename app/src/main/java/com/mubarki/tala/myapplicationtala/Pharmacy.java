package com.mubarki.tala.myapplicationtala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Pharmacy extends AppCompatActivity {
    private Button btnAddMedicine;
    private ListView lstdynamic1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy);
        btnAddMedicine = (Button) findViewById(R.id.btnAddMedicine);
        lstdynamic1 = (ListView) findViewById(R.id.lstdynamic1);
    }

    public void onClick(View v) {
        if (v == btnAddMedicine) {

            Intent intent = new Intent(Pharmacy.this, AddingPatients.class);
            startActivity(intent);
            finish();
        }
        initListview();
    }
    private void initListview(){
        lstdynamic1 = (ListView) findViewById(R.id.lstdynamic);
        /////////MyMeddicineTable table=new MyMeddicineTable(this);
        String[] a={"one","two","three"};
        /////////  ArrayAdapter<MyPharmacy> adapter=new ArrayAdapter<MyPharmacy>(this, android.R.layout.simple_expandable_list_item_2,table.getAllMedicine() );
        /////////  lstdynamic1.setAdapter(adapter);
    }
    }
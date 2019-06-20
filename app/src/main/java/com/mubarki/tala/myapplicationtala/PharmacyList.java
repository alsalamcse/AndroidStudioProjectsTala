package com.mubarki.tala.myapplicationtala;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class PharmacyList extends AppCompatActivity {
    private Button btnAddMedicine;
    private ListView lstdynamic1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy);
        btnAddMedicine = (Button) findViewById(R.id.btnAddMedicine);
        lstdynamic1 = (ListView) findViewById(R.id.lstdynamic1);
    }

    public void onClick(View v1)
    {
        if (v1 == btnAddMedicine)
        {

            Intent intent = new Intent(PharmacyList.this, AddingMedicine.class);
            startActivity(intent);
            finish();
        }
        initListview();
    }
    private void initListViewArraySample(){
        lstdynamic1=(ListView) findViewById(R.id.lstdynamic1);
        String[] a={"one","two","three"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,a);
        lstdynamic1.setAdapter(adapter);
    }
    private void initListview(){
        lstdynamic1 = (ListView) findViewById(R.id.lstdynamic1);
        MyMedicineTable m=new MyMedicineTable(this);

          ArrayAdapter<MyPharmacy> adapter=new ArrayAdapter<MyPharmacy>(this, android.R.layout.simple_expandable_list_item_1,m.getAllPatient());
        lstdynamic1.setAdapter(adapter);
        lstdynamic1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PharmacyList.this,"position:"+position,Toast.LENGTH_SHORT).show();

                MyClinic m1=(MyClinic) parent.getItemAtPosition(position);
                Toast.makeText(PharmacyList.this,"Name:"+m1.getName(),Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+m1.getName()));
                startActivity(i);
                finish();
                return true;
            }
        });

    }
    }
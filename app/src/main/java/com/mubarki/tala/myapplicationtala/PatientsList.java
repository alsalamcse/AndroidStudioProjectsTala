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

public class PatientsList extends AppCompatActivity {
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

            Intent intent = new Intent(PatientsList.this, AddingPatients.class);
            startActivity(intent);
            finish();
        }
    }
    private void initListViewArraySample(){
        lstdynamic=(ListView) findViewById(R.id.lstdynamic);
        String[] a={"one","two","three"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,a);
        lstdynamic.setAdapter(adapter);
    }






    private void initListview(){
        lstdynamic = (ListView) findViewById(R.id.lstdynamic);

        MyPatientsTable m1=new MyPatientsTable(this);
       // String[] a={"one","two","three"};

      //  ArrayAdapter<MyClinic> a=m1.getAllMedicine();
        ArrayAdapter<MyClinic> adapter=new ArrayAdapter<MyClinic>(this, android.R.layout.simple_expandable_list_item_1,m1.getAllMedicine());
        lstdynamic.setAdapter(adapter);

        lstdynamic.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(PatientsList.this, "position:" + position, Toast.LENGTH_SHORT).show();
                MyClinic m1=(MyClinic) parent.getItemAtPosition(position);
                Toast.makeText(PatientsList.this,"Name:"+m1.getName(),Toast.LENGTH_SHORT).show();
                Intent i1=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+m1.getName()));
                startActivity(i1);
                finish();
                return true;
            }
        });
    }
}

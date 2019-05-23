package com.mubarki.tala.talacontacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddContact extends AppCompatActivity {
    private Button btnSave;
    private TextView etName,etnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        etName=(EditText)findViewById(R.id.etName);
        etnum=(EditText)findViewById(R.id.etNum);
        btnSave=(Button) findViewById(R.id.btnSave);
    }

    public void onClick(View v){
        if(v==btnSave)
        {
            Intent intent = new Intent(AddContact.this, AllContacts.class);
            startActivity(intent);
            finish();
        }
    }
}


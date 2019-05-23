package com.mubarki.tala.talacontacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class AllContacts extends AppCompatActivity {
    private Button btnAdd;
    private ListView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_contacts);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        ls=(ListView)findViewById(R.id.ls);
    }
    public void onClick(View v)
    {
        if(v==btnAdd)
        {
            Intent intent = new Intent(AllContacts.this, AddContact.class);
            startActivity(intent);
            finish();
        }

    }
}

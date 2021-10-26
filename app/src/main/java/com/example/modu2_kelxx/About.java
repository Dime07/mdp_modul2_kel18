package com.example.modu2_kelxx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.modu2_kelxx.R;

public class About extends AppCompatActivity {

    String[]values = new String[]
            {      "Edho Sulenda Satrio Pambudi \n 21120116120023",
                    "Yisrel Indrawan \n 21120118130082",
                    "Dimas Rafi \n 21120119120022",
                    "Hafshah Qurrata Ayun \n 21120119140123",
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ArrayAdapter adapter =  new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1,values);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }

}
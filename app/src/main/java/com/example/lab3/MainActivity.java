package com.example.lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listDrop;


    private ArrayList<String> strArray;
    private ArrayAdapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listDrop = findViewById(R.id.listDrop);
        strArray = new ArrayList<>();
        strArray.add("one");
        strArray.add("Blue");
        strArray.add("C");

        Adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, strArray);
        listDrop.setAdapter(Adapter);
        listDrop.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clicked item: " + position + " " + strArray.get(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });

        listDrop.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                return true;
            }
        });




    }

}

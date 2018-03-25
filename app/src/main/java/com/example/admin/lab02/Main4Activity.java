package com.example.admin.lab02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    ListView lsvCate;
    AutoCompleteTextView actCate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        lsvCate = findViewById(R.id.lsvCate);
        actCate = findViewById(R.id.actCate);

        final String[] values = {"Lap trinh co ban", "Lap trinh huong doi tuong", "Thiet ke giao dien android",
                "Lap trinh nang cao voi android", "Lap trinh android co ban", "Lap trinh PHP", "Phototshop", "Premiere", "Acrobat Reader"
        , "Illustrator"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Main4Activity.this, android.R.layout.simple_list_item_1,
                android.R.id.text1,
                values);
        actCate.setAdapter(adapter);

        lsvCate.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Main4Activity.this, "Ban da chon mon hoc " + values[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}

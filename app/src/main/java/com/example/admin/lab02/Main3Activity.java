package com.example.admin.lab02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
    Spinner spn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        spn = findViewById(R.id.spnCate);

        final String[] nice = {"Fpoly HN", "Fpoly HCM", "Fpoly QN", "Fpoly TN" , "Fpoly DN", "Fpoly TH"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Main3Activity.this, R.layout.support_simple_spinner_dropdown_item, nice);
        spn.setAdapter(adapter);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int index = spn.getSelectedItemPosition();
                Toast.makeText(Main3Activity.this, "Chuỗi bạn chọn ở vị trí : " + (index + 1), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(Main3Activity.this, "Hãy chọn gì đó", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

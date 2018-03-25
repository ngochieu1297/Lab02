package com.example.admin.lab02;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbCream, cbSugar;
    Button btnPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbCream = findViewById(R.id.cbCream);
        cbSugar = findViewById(R.id.cbSugar);
        btnPay = findViewById(R.id.btnPay);

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbCream.isChecked()){
                    Toast.makeText(MainActivity.this, "Coffee & Cream", Toast.LENGTH_SHORT).show();
                }
                if(cbSugar.isChecked()){
                    Toast.makeText(MainActivity.this, "Coffee & Sugar", Toast.LENGTH_SHORT).show();
                }
                if(cbSugar.isChecked() && cbCream.isChecked()){
                    Toast.makeText(MainActivity.this, "Coffee & Sugar & Cream", Toast.LENGTH_SHORT).show();
                }
            }
        });

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Information!!!").setMessage("Are you sure to exit ?").setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}

package com.example.admin.lab02;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    RadioButton rbCream, rbSugar;
    Button btnPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnPay = findViewById(R.id.btnPay);
        rbCream = findViewById(R.id.rbCream);
        rbSugar = findViewById(R.id.rbSugar);

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rbSugar.isChecked()){
                    rbCream.setChecked(false);
                }
                if(rbCream.isChecked()){
                    rbSugar.setChecked(false);
                }
                if(rbCream.isChecked()){
                    Toast.makeText(Main2Activity.this, "Coffee & Cream", Toast.LENGTH_SHORT).show();
                }
                if(rbSugar.isChecked()){
                    Toast.makeText(Main2Activity.this, "Coffee & Sugar", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Information!!!").setMessage("Are you sure want to exit ?").setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Main2Activity.this.finish();
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

package com.yazidmf.dasar02spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Atribute
    TextView txtPilih;
    private Spinner spinner;
    private String[] list = {"Tidak ada yang dipilih", "Warung Pak Tatto", "Warung AWE", "Warung Bangkrut", "Kedai Kopi",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Temukan Viewnya
        txtPilih = findViewById(R.id.txtSpinner);
        spinner = findViewById(R.id.spinner);

        //Spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long I) {
                //Mamasukan Parameter
                txtPilih.setText(list[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Jika tidak di Kelik
                txtPilih.setText("");
            }
        });

        //Array
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
        //Nampilin
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}

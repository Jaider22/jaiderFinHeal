package com.example.finheal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Cuentas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuentas)
    }
    Spinner cuentasSpinner = findViewById(R.id.cuentas_spinner);
    cuentasSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String cuentaSeleccionada = parent.getItemAtPosition(position).toString();


        @Override
        public void onNothingSelected(AdapterView<?> parent) {

    });


}
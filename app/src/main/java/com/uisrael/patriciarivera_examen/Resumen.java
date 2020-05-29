package com.uisrael.patriciarivera_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Resumen extends AppCompatActivity {

    EditText  datoReci1, datoReci2, datoReci3, datoReci4, datoReci5, datoReci6;
    Bundle dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        datoReci1 = findViewById(R.id.etUsuarioConectado);
        datoReci2 = findViewById(R.id.etNombreReci);
        datoReci3 = findViewById(R.id.etPagoReci);
        datoReci4 = findViewById(R.id.etRespuesta1Reci);
        datoReci5 = findViewById(R.id.etRespuesta2Reci);
        datoReci6 = findViewById(R.id.etRespuesta3Reci);


        dato = getIntent().getExtras();
        String recibir1 = dato.getString("datoEnviado1");
        datoReci1.setText(recibir1);
        String recibir2 = dato.getString("datoEnviado2");
        datoReci2.setText(recibir2);
        String recibir3 = dato.getString("datoEnviado3");
        datoReci3.setText(recibir3);
        String recibir4 = dato.getString("datoEnviado4");
        datoReci4.setText(recibir4);
        String recibir5 = dato.getString("datoEnviado5");
        datoReci5.setText(recibir5);
        String recibir6 = dato.getString("datoEnviado6");
        datoReci6.setText(recibir6);
    }
}

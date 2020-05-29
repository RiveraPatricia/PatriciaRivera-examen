package com.uisrael.patriciarivera_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {

    EditText datoReci1, res;
    Bundle dato;
    CheckBox dep1, dep2, dep3;
    RadioButton si, no;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        datoReci1 = findViewById(R.id.etUsuarioConectado);
        res = findViewById(R.id.etRespuesta);

        dep1 = findViewById(R.id.cbDeporte1);
        dep2 = findViewById(R.id.cbDeporte2);
        dep3 = findViewById(R.id.cbDeporte3);

        si = findViewById(R.id.rbRespuesta1);
        no = findViewById(R.id.rbRespuesta2);

        dato = getIntent().getExtras();
        String recibir1 = dato.getString("datoEnviado1");
        datoReci1.setText(recibir1);
    }

    public void Enviar (View v) {

        Intent intentEnviar = new Intent(Encuesta.this, Resumen.class);

        if (dep1.isChecked() == true && si.isChecked() == true) {


            intentEnviar.putExtra("datoEnviado4", res.getText().toString());
            intentEnviar.putExtra("datoEnviado5", dep1.getText().toString());
            intentEnviar.putExtra("datoEnviado6", si.getText().toString());
        }
        if (dep1.isChecked() == true && no.isChecked() == true) {


            intentEnviar.putExtra("datoEnviado4", res.getText().toString());
            intentEnviar.putExtra("datoEnviado5", dep1.getText().toString());
            intentEnviar.putExtra("datoEnviado6", no.getText().toString());

        }

        if (dep2.isChecked() == true && si.isChecked() == true) {


            intentEnviar.putExtra("datoEnviado4", res.getText().toString());
            intentEnviar.putExtra("datoEnviado5", dep2.getText().toString());
            intentEnviar.putExtra("datoEnviado6", si.getText().toString());

        }

        if (dep2.isChecked() == true && no.isChecked() == true) {


            intentEnviar.putExtra("datoEnviado4", res.getText().toString());
            intentEnviar.putExtra("datoEnviado5", dep2.getText().toString());
            intentEnviar.putExtra("datoEnviado6", no.getText().toString());

        }
        if (dep3.isChecked() == true && si.isChecked() == true) {


            intentEnviar.putExtra("datoEnviado4", res.getText().toString());
            intentEnviar.putExtra("datoEnviado5", dep3.getText().toString());
            intentEnviar.putExtra("datoEnviado6", si.getText().toString());

            if (dep3.isChecked() == true && no.isChecked() == true) {


                intentEnviar.putExtra("datoEnviado4", res.getText().toString());
                intentEnviar.putExtra("datoEnviado5", dep3.getText().toString());
                intentEnviar.putExtra("datoEnviado6", no.getText().toString());

            }

            startActivity(intentEnviar);
            Toast.makeText(getApplicationContext(), "Envio Realizado", Toast.LENGTH_LONG).show();

        }
    }
}

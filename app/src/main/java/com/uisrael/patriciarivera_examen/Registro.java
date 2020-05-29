package com.uisrael.patriciarivera_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    EditText datoReci1, nom, mon, pag;
    Bundle dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        datoReci1 = findViewById(R.id.etUsuarioConectado);
        nom = findViewById(R.id.etNombre);
        mon = findViewById(R.id.etMonto);
        pag = findViewById(R.id.etPago);

        dato = getIntent().getExtras();
        String recibir1 = dato.getString("datoEnviado1");
        datoReci1.setText(recibir1);

    }
    public void Calcular (View v) {

        int cos=1800, monto, rest, div, cant=3;
        float inte, total;
        float  por= (float) 0.5;

        monto= Integer.parseInt(mon.getText().toString());
        rest = cos - monto;
        div = rest / cant;
        inte = cos * por;
        total = div + inte;
        pag.setText(Float.toString(total));

    }

    public void enviarCalcular (View v) {

        Intent intentCalcularEnviar = new Intent( Registro.this, Resumen.class);
        intentCalcularEnviar.putExtra("datoEnviado2", nom.getText().toString());
        intentCalcularEnviar.putExtra("datoEnviado3", pag.getText().toString());
        Intent intentCalcular = new Intent( Registro.this, Encuesta.class);
        startActivity(intentCalcular);
        Toast.makeText(getApplicationContext(), "Envio Realizado", Toast.LENGTH_LONG).show();

    }
}

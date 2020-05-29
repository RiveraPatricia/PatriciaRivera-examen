package com.uisrael.patriciarivera_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText usu, cla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usu = findViewById(R.id.etUsuario);
        cla = findViewById(R.id.etClave);
    }

    public void Ingresar (View v) {

        if (usu.getText().toString().equals("estudiante2020") && cla.getText().toString().equals("uisrael2020")) {

            Intent intentIngresar1 = new Intent( Login.this, Registro.class);
            intentIngresar1.putExtra("datoEnviado1", usu.getText().toString());
            Intent intentIngresar2 = new Intent( Login.this, Encuesta.class);
            intentIngresar2.putExtra("datoEnviado1", usu.getText().toString());
            Intent intentIngresar3 = new Intent( Login.this, Resumen.class);
            intentIngresar3.putExtra("datoEnviado1", usu.getText().toString());
            startActivity(intentIngresar1);
            Toast.makeText(getApplicationContext(), "Bienvenid@ "+ usu.getText() + ", Envio Realizado", Toast.LENGTH_LONG).show();
        }

        else {

            Toast.makeText(getApplicationContext(), "Usuario y/o Clave Incorrecto/os", Toast.LENGTH_LONG).show();
        }
    }
}

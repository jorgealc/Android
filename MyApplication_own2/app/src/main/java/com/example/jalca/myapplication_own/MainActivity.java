package com.example.jalca.myapplication_own;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public String contrasena="abc123";
    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText);

    }

    public void verificar(View view)
    {

        String valorIngresado= et1.getText().toString();
        Intent i= new Intent(this,Bienvenido.class);
        if (valorIngresado.equals(contrasena)){
            startActivity(i);
        }
        else
        {
            Toast notificacion=Toast.makeText(this,"Has ingresado una clave incorrecta",Toast.LENGTH_LONG);
              notificacion.show();

        }


    }

}

package com.example.jalca.myapplication_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText);
        tv1=(TextView)findViewById(R.id.textView);

    }


    public void ocultar(View vista) {
         Integer numero_introducido;
        InputMethodManager miteclado=(InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        miteclado.hideSoftInputFromWindow(et1.getWindowToken(),0);
        try {
            numero_introducido=Integer.parseInt(et1.getText().toString());

        }catch(Exception e){
            numero_introducido=0;
        }

        tv1.setText(numero_introducido);

    }
}
package com.example.jalca.myapplication_dibujo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //MiPropiaVista miPropiaVista= new MiPropiaVista(this);
        setContentView(R.layout.activity_main);
        RelativeLayout layout1=(RelativeLayout)findViewById(R.id.layout1);
        Lienzo fondo= new Lienzo(this);
        layout1.addView(fondo);
    }


        class Lienzo extends View{

            public Lienzo(Context context){
                super(context);

            }

            protected void onDraw(Canvas canvas){


                canvas.drawRGB(255,255,255);
                int ancho=canvas.getWidth();
                Paint pincel1=new Paint();
                pincel1.setARGB(255,255,0,0);
                canvas.drawRect(10,10,ancho-10,40,pincel1);
                pincel1.setStyle(Paint.Style.STROKE);
                canvas.drawRect(10,60,ancho-10,90,pincel1);
                pincel1.setStrokeWidth(3);
                canvas.drawRect(10,110,ancho-10,140,pincel1);

            }
   }

}



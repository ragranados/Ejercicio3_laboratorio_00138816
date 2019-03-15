package com.example.ejercicio2;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imagen1;
    ImageView imagen2;
    ImageView imagen3;
    ImageView imagen4;
    ImageView imagen5;
    ImageView imagen6;
    ImageView imagen7;
    ImageView imagen8;
    ImageView imagen9;

    int img1,img2,img3,img4,img5,img6,img7,img8,img9;

    int arreglo[] = {R.drawable.leona, R.drawable.lissandraclassic,R.drawable.twistedfateclassic,R.drawable.zedclassic,R.drawable.swainclassic,R.drawable.jannaclassic,
            R.drawable.talon,R.drawable.kaisaclassic,R.drawable.missfortunegungoddess};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen1 = findViewById(R.id.img1);
        imagen1.setOnClickListener(this);
        img1 = 0;
        imagen2 = findViewById(R.id.img2);
        imagen2.setOnClickListener(this);
        img2 = 1;
        imagen3 = findViewById(R.id.img3);
        imagen3.setOnClickListener(this);
        img3 = 2;
        imagen4 = findViewById(R.id.img4);
        imagen4.setOnClickListener(this);
        img4 = 3;
        imagen5 = findViewById(R.id.img5);
        imagen5.setOnClickListener(this);
        img5 = 4;
        imagen6 = findViewById(R.id.img6);
        imagen6.setOnClickListener(this);
        img6 = 5;
        imagen7 = findViewById(R.id.img7);
        imagen7.setOnClickListener(this);
        img7 = 6;
        imagen8 = findViewById(R.id.img8);
        imagen8.setOnClickListener(this);
        img8 = 7;
        imagen9 = findViewById(R.id.img9);
        imagen9.setOnClickListener(this);
        img9 = 8;

    }


    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch(viewId){
            case R.id.img1:
                img1 = sumar(img1);
                imagen1.setImageResource(arreglo[img1]);
                break;
            case R.id.img2:
                img2 = sumar(img2);
                imagen2.setImageResource(arreglo[img2]);
                break;
            case R.id.img3:
                img3 = sumar(img3);
                imagen3.setImageResource(arreglo[img3]);
                break;
            case R.id.img4:
                img4 = sumar(img4);
                imagen4.setImageResource(arreglo[img4]);
                break;
            case R.id.img5:
                img5 = sumar(img5);
                imagen5.setImageResource(arreglo[img5]);
                break;
            case R.id.img6:
                img6 = sumar(img6);
                imagen6.setImageResource(arreglo[img6]);
                break;
            case R.id.img7:
                img7 = sumar(img7);
                imagen7.setImageResource(arreglo[img7]);
                break;
            case R.id.img8:
                img8 = sumar(img8);
                imagen8.setImageResource(arreglo[img8]);
                break;
            case R.id.img9:
                img9 = sumar(img9);
                imagen9.setImageResource(arreglo[img9]);
                break;
        }
    }

    public int sumar(int i){
        if(i < 8){
            return i+1;
        }else{
            return 0;
        }
    }
}

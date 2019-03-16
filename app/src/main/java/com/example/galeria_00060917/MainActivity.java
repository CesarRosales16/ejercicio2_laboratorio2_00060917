package com.example.galeria_00060917;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public ArrayList<Integer> imagenes = new ArrayList<Integer>();
    int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagenes.add(R.drawable.img1);
        imagenes.add(R.drawable.img2);
        imagenes.add(R.drawable.img3);
        imagenes.add(R.drawable.img4);
        imagenes.add(R.drawable.img5);
        imagenes.add(R.drawable.img6);

        ImageView v1 = findViewById(R.id.img1);
        ImageView v2 = findViewById(R.id.img2);
        ImageView v3 = findViewById(R.id.img3);
        ImageView v4 = findViewById(R.id.img4);
        ImageView v5 = findViewById(R.id.img5);
        ImageView v6 = findViewById(R.id.img6);
        ImageView v7 = findViewById(R.id.img7);
        ImageView v8 = findViewById(R.id.img8);
        ImageView v9 = findViewById(R.id.img9);

        v1.setOnClickListener(this);
        v2.setOnClickListener(this);
        v3.setOnClickListener(this);
        v4.setOnClickListener(this);
        v5.setOnClickListener(this);
        v6.setOnClickListener(this);
        v7.setOnClickListener(this);
        v8.setOnClickListener(this);
        v9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ImageView image = findViewById(v.getId());
        numero = (int) (Math.random() * (6));
        image.setImageResource(imagenes.get(numero));
    }
}

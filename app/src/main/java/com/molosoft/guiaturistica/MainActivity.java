package com.molosoft.guiaturistica;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView cercanos = (TextView) findViewById(R.id.cercanos);
        TextView comercios = (TextView) findViewById(R.id.comercios);
        TextView interes = (TextView) findViewById(R.id.interes);

        cercanos.setOnClickListener(view -> {
            Intent cercanosIntent = new Intent(MainActivity.this, Cercanos.class);
            startActivity(cercanosIntent);
        });
        comercios.setOnClickListener(view -> {
            Intent comerciosIntent = new Intent(MainActivity.this, Comercios.class);
            startActivity(comerciosIntent);

        });

        interes.setOnClickListener(view -> {
            Intent interesIntent = new Intent(MainActivity.this, Interes.class);
            startActivity(interesIntent);
        });

    }


}
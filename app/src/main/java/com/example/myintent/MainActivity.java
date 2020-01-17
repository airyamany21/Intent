package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.botonGoToSecondA2);
        textView = findViewById(R.id.textView);

        // se guarda tel valor del otro activity (osea el texto que se le ingreso)
        String dato = getIntent().getStringExtra("dato");// en ambos activity se tiene el mismo ("dato")
        textView.setText(dato);

        // Si se presiona el boton1 se va al activity2
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se crea un intent para pasar a otro activity (donde estoy, hacia donde voy)
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);// arranca el activity
            }
        });
    }
}

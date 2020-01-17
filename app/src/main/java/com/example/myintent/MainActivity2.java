package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText editText;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = findViewById(R.id.botonSendTextBack);
        editText = findViewById(R.id.editText);

        // cuando se presione el boton2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                // obtiene el texto ingresado del editext y lo mando al MainActivity
                intent.putExtra("dato", editText.getText().toString());// en ambos activity se tiene el mismo ("dato")
                startActivity(intent);// arranca el activity
            }
        });
    }
}

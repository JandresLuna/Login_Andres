package com.example.parcial_andres;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Respuestas extends AppCompatActivity {
    TextView respuestas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_respuestas);

        respuestas = findViewById(R.id.respuestas);

        String contenido = "1)\nC\n" +
                "2)\nC\n" +
                "3)\nC\n" +
                "4)\nB\n" +
                "5)\nC\n" +
                "6)\nA\n" +
                "7)\nC\n" +
                "8)\nB";

        respuestas.setText(contenido);

    }
}
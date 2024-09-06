package com.example.parcial_andres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edt_usuario,edt_contraseña;
    Button btn_ingresar;
    String usuario = "uac123";
    String contraseña = "12345678";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    edt_usuario = findViewById(R.id.edt_usuario);
    edt_contraseña = findViewById(R.id.edt_contraseña);
    btn_ingresar = findViewById(R.id.btn_ingresar);


    btn_ingresar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String textUsuario = edt_usuario.getText().toString();
            String textContraseña = edt_contraseña.getText().toString();


            if (textUsuario.equals("") || textContraseña.equals("")){

                Toast.makeText(MainActivity.this, "Por Favor llenar los datos", Toast.LENGTH_LONG).show();

            } else if (textUsuario.equals(usuario) && textContraseña.equals(contraseña)){
                Intent i = new Intent(MainActivity.this, Respuestas.class);
                startActivity(i);

            }else{
                Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
            }
        }
    });

    }
}
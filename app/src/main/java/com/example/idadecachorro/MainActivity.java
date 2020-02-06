package com.example.idadecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextIdade;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextIdade = findViewById(R.id.editIdade);
        textViewResultado = findViewById(R.id.textResultado);
    }

    public void calcularIdade(View view){

        int idade  = Integer.parseInt(editTextIdade.getText().toString());
        int resultado = idade * 7;

        textViewResultado.setText("Idade Igual a: "+resultado);

    }

}

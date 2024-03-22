package com.example.appviagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText e1;
    private EditText e2;
    private EditText e3;
    private Button btn1;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // A partir daqui vem a lógica
        e1 = findViewById(R.id.edtAutonomia);
        e2 = findViewById(R.id.edtDistancia);
        e3 = findViewById(R.id.edtValorLitro);
        btn1 = findViewById(R.id.btnOk);
        txt = findViewById(R.id.txtResultado);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String autonomia = e1.getText().toString();
                String distancia = e2.getText().toString();
                String valorlitro = e3.getText().toString();
                float nro1 = Float.parseFloat(autonomia);
                float nro2 = Float.parseFloat(distancia);
                float nro3 = Float.parseFloat(valorlitro);
                float resultado = nro2 / nro1 * nro3;
                String result = String.valueOf(resultado);
                txt.setText("Custo da viagem: R$ "+result);
            }
        });
    }
}
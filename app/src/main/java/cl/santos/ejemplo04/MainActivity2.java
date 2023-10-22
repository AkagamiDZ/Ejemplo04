package cl.santos.ejemplo04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    Button btCalcular;
    Button btLimpiar;
    EditText etPeso;
    EditText etAltura;
    EditText texto;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btCalcular = findViewById(R.id.BTCalcular);
        btLimpiar = findViewById(R.id.BTlimpiar);
        etPeso = findViewById(R.id.ETPeso);
        etAltura = findViewById(R.id.ETAltura);
        texto = findViewById(R.id.ETPeso);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pesotexto = etPeso.getText().toString();
                String alturatexto = etAltura.getText().toString();
                double peso = Double.parseDouble(pesotexto);
                double altura = Double.parseDouble(alturatexto);
                Double resultado = peso / (altura * altura) ;

                Intent intent = new Intent(getApplicationContext(), MainResultado.class);
                intent.putExtra("mensaje", resultado);
                startActivity(intent);
                finish();
            }
        });



        btLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etPeso.setText("");
                etAltura.setText("");
            }
        });
    }
}
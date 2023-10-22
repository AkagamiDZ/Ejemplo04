package cl.santos.ejemplo04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    Button BTCalcular;
    Button BTLimpiar;
    EditText ETPeso;
    EditText ETAltura;

    EditText texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BTCalcular = findViewById(R.id.BTCalcular);
        texto = findViewById(R.id.ETPeso);
        BTLimpiar = findViewById(R.id.BTlimpiar);
        ETPeso = findViewById(R.id.ETPeso);
        ETAltura = findViewById(R.id.ETAltura);

        BTCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pesotexto = ETPeso.getText().toString();
                String alturatexto = ETAltura.getText().toString();
                double peso = Double.parseDouble(pesotexto);
                double altura = Double.parseDouble(alturatexto);
                Double resultado = peso = altura;

                Intent intent = new Intent(getApplicationContext(), MainResultado.class);
                intent.putExtra("mensaje", resultado);
                startActivity(intent);
                finish();
            }

        });



        BTLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETPeso.setText("");
                ETAltura.setText("");
            }
        });
    }
}
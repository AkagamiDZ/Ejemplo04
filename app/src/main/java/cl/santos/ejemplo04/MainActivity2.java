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
    EditText etVerduleria;
    EditText etHectareas;
    EditText texto;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btCalcular = findViewById(R.id.BTCalcular);
        btLimpiar = findViewById(R.id.BTlimpiar);
        etVerduleria = findViewById(R.id.ETVerduleria);
        etHectareas = findViewById(R.id.ETHectareas);
        texto = findViewById(R.id.ETVerduleria);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String verduleriatexto = etVerduleria.getText().toString();
                String hectareastexto = etHectareas.getText().toString();
                double velduleria = Double.parseDouble(verduleriatexto);
                double hectareas = Double.parseDouble(hectareastexto);
                Double resultado = velduleria * hectareas ;

                Intent intent = new Intent(getApplicationContext(), MainResultado.class);
                intent.putExtra("mensaje", resultado);
                startActivity(intent);
                finish();
            }
        });



        btLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etVerduleria.setText("");
                etHectareas.setText("");
            }
        });
    }
}
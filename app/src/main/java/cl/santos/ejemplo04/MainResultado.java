package cl.santos.ejemplo04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainResultado extends AppCompatActivity {

    TextView texto;
    Button BTVolver;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resultado);

        texto = findViewById(R.id.TVResultado);
        BTVolver = findViewById(R.id.BTvolver);
        double resultado = getIntent().getDoubleExtra("mensaje",0);

        texto.setText("El Resultado es:" + String.valueOf(resultado));
        BTVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });



    }
}
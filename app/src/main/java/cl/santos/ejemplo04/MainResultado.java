package cl.santos.ejemplo04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainResultado extends AppCompatActivity {

    TextView resultado;
    Button aceptar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resultado);
        resultado= (TextView) findViewById(R.id.TVResultado);
        aceptar=(Button) findViewById(R.id.BTResultado2);

        resultado.setText("Su nombre es :" + getIntent());
        Intent intent = new Intent(this, MainActivity.class);
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });



    }
}
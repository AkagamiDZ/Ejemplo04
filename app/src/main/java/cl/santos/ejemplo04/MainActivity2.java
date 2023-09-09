package cl.santos.ejemplo04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    Button aceptar;
    EditText etnombres;
    EditText etapellidos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resultado);
        aceptar=(Button) findViewById(R.id.BTResultado2);
        etnombres=(EditText) findViewById(R.id.ETNombre);
        etapellidos=(EditText) findViewById(R.id.ETApellidos);

        Intent intent = new Intent(this, MainResultado.class);
        intent.putExtra("nombre",etnombres.getText() );

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
package cl.santos.ejemplo04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button ayuda,calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intenyAyuda=new Intent(this, MainActivity3.class);
        Intent intentCalcular= new Intent(this, MainActivity2.class);

        ayuda=(Button) findViewById(R.id.BTAyuda);
        calcular=(Button) findViewById(R.id.BTResultado2);
        ayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intenyAyuda);

            }
        });
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentCalcular);
            }
        });
    }
}
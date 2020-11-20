package aula3.grupouninter.calculadoranova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.*;
import android.widget.*;


public class MainActivity extends AppCompatActivity {


    Button  btNumero1, btNumero2, btSomar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btNumero1 = (Button) findViewById(R.id.btNumero1);
        btNumero2 = (Button) findViewById(R.id.btNumero2);
        btSomar = (Button) findViewById(R.id.btSomar);

        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });



    }
}

package iptv.g.iptv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void startCanalsbt (View view){
            Intent activity_canalsbt = new Intent(this, Canalsbt.class);
            startActivity(activity_canalsbt);
        }

}


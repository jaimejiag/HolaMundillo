package com.example.jaime.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Mi app estupida de Android
 * @author Jaime Jiménez
 * @version 1.0
 * @see android.app.Activity
 */
public class HolaMundoActivity extends AppCompatActivity {
    private TextView txvMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvMessage = (TextView) findViewById(R.id.txv_message);
        txvMessage.setText("¡Vaya paquete de App!");
    }
}

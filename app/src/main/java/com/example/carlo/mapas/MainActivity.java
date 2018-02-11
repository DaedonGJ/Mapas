package com.example.carlo.mapas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = (Button) findViewById(R.id.buscar);
        Button bt2 = (Button) findViewById(R.id.email);
        Button bt3 = (Button) findViewById(R.id.web);

        bt.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent i = new Intent();
        Intent chooser = null;
        switch (view.getId()) {
            case R.id.buscar:
                EditText longitud = (EditText) findViewById(R.id.longitud);
                EditText latitud = (EditText) findViewById(R.id.latitud);
                i.setAction(Intent.ACTION_VIEW);
                Toast.makeText(this, "empezando", Toast.LENGTH_LONG).show();
                i.setData(Uri.parse("geo:" + latitud.getText().toString() + "," + longitud.getText().toString()));
                chooser = i.createChooser(i, "Lanzar mapas");
                break;
            case R.id.web:
                break;
            case R.id.email:
                break;
        }
        startActivity(i);

    }
}

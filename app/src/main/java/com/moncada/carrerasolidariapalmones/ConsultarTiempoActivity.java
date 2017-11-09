package com.moncada.carrerasolidariapalmones;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

public class ConsultarTiempoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_tiempo);
        Button btnConsultaTiempo = (Button)findViewById(R.id.btnConsultaTiempo);
        btnConsultaTiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvResultado = (TextView)findViewById(R.id.tvResultado);
                tvResultado.setVisibility(TextView.VISIBLE);
                //Oculta el teclado virtual
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        });
    }



}

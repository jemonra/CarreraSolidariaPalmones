package com.moncada.carrerasolidariapalmones;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_infoCarrera) {
            startActivity(new Intent(MainActivity.this, InfoCarreraActivity.class));
            return true;
        }
        if (id == R.id.action_agenda) {
            startActivity(new Intent(MainActivity.this, AgendaActivity.class));
            return true;
        }
        if (id == R.id.action_inscripcion) {
            startActivity(new Intent(MainActivity.this, InscripcionActivity.class));
            return true;
        }
        if (id == R.id.action_recorrido) {
            startActivity(new Intent(MainActivity.this, RecorridoActivity.class));
            return true;
        }
        if (id == R.id.action_consultarTiempo) {
            startActivity(new Intent(MainActivity.this, ConsultarTiempoActivity.class));
            return true;
        }
        if (id == R.id.action_galeria) {
            startActivity(new Intent(MainActivity.this, GaleriaActivity.class));
            return true;
        }
        /*if (id == R.id.action_salir) {
            finish();
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
}

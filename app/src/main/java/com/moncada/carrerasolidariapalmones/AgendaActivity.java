package com.moncada.carrerasolidariapalmones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AgendaActivity extends AppCompatActivity {

    ListView lista;
    private String fechas[] = new String[]{ "Actividades previas - Desde el 1 de febrero",
                                            "Dorsales - Del 13 de abril al 15 Abril 2017",
                                            "La carrera - 15 de abril de 2017"};
    private String eventos[][] = new String[][]{{"- Entrenamientos colectivos y solidarios",
                                                        "- Campañas de ayuda con Asociación Familiares Alzheimer Barreño",
                                                        "- Venta de camisetas a través de nuestra app para ayuda a asociación."},
                                               {"- Fila 0: Ayuda directa para Asociación Familiares Alzheimer Barreño",
                                                        "- Venta de camisetas",
                                                        ""},
                                               {"- Carrera Absoluta: 10:30",
                                                        "- Carreras Infantiles: A partir de las 11:30",
                                                        "- Entrega de Trofeos: 13:00"}
                                               };

    //-- Siempre va a tener el mismo icono
    //private Integer imgid[] = new Integer[]{1, 2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        //-- Se rellenan los eventos



        //-- Se crea el adaptador personalizado
        AdaptadorListViewAgenda adapter=new AdaptadorListViewAgenda(this, fechas, eventos);

        //-- Se asigna el adaptador a la lista
        lista = (ListView) findViewById(R.id.lvAgenda);
        lista.setAdapter(adapter);
    }
}

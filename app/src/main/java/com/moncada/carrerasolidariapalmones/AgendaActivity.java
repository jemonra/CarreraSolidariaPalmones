package com.moncada.carrerasolidariapalmones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AgendaActivity extends AppCompatActivity {

    ListView lista;
    private String fechas[] = new String[]{ "Inscripciones",
                                            "Dorsales - Del 13 de abril al 15 Abril 2018",
                                            "La carrera - 15 de abril de 2018",
                                            "Campañas de ayuda"};
    private String eventos[][] = new String[][]{{"- Desde el 1 de febrero a las 14h hasta el 11 de abril a las 14h.",
                                                        "- Máximo 500 dorsales para adultos.",
                                                        "- Dorsales infantiles ilimitados."},
                                               {"- Viernes 13 de 17h a 19h, en el salón de actos Acerinox.",
                                                        "- Sábado 14 de 10h a 13h y de 17h a 19h, en el salón de actos de Acerinox.",
                                                        "- Domingo 15 de 9h a 10h absoluta y de 9h a 11h infantiles en la salida de carrera, Plaza del mar"},
                                               {"- Carrera Absoluta: 10:30",
                                                        "- Carreras Infantiles: A partir de las 11:30",
                                                        "- Entrega de Trofeos: 13:00"},
                                               {"- Desde el 1 de febrero, campañas de ayuda con Asociación Familiares Alzheimer Barreño.",
                                                        "",
                                                        ""}
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

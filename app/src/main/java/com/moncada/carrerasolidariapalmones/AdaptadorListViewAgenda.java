package com.moncada.carrerasolidariapalmones;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.moncada.carrerasolidariapalmones.R;

/**
 * Created by Cesar on 12/10/2015.
 */
public class AdaptadorListViewAgenda extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] fechas;
    private final String[][] itemname;
    //private final String[] itemdesc1;
    //private final String[] itemdesc2;
    //private final String[] itemdesc3;
    //-- No vamos a tener lista de imágenes, siempre la misma
    //private final Integer[] integers;

    //Monta el adaptador personalizado
    public AdaptadorListViewAgenda(Activity context, String[] fechas, String[][] itemname) {
        super(context, R.layout.fila_agenda, fechas);


        this.context=context;
        this.fechas = fechas;
        this.itemname=itemname;
        //this.itemdesc1=itemdesc1;
        //this.itemdesc2=itemdesc2;
        //this.itemdesc3=itemdesc3;
        //-- El array de imágenes no lo vamos a recibir, siempre la misma
        //this.integers=integers;
    }

    //-- Función que monta cada cada elemento de la lista según la posición
    public View getView(int posicion,View view, ViewGroup parent){

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.fila_agenda,null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.texto_principal);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView txtDescripcion1 = (TextView) rowView.findViewById(R.id.texto_secundario1);
        TextView txtDescripcion2 = (TextView) rowView.findViewById(R.id.texto_secundario2);
        TextView txtDescripcion3 = (TextView) rowView.findViewById(R.id.texto_secundario3);

        txtTitle.setText(fechas[posicion]);
        txtDescripcion1.setText(itemname[posicion][0]);
        txtDescripcion2.setText(itemname[posicion][1]);
        txtDescripcion3.setText(itemname[posicion][2]);
        //-- La imagen no se personaliza, siempre vamos a usar la misma
        //imageView.setImageResource(integers[posicion]);
        imageView.setImageResource(R.drawable.calendar);

        return rowView;
    }


}
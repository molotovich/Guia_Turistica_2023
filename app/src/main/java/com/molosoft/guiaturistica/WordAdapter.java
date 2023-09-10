package com.molosoft.guiaturistica;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorFondo;

    public WordAdapter(Activity context, ArrayList<Word> androidWords, int colorFondo) {
        super(context, 0, androidWords);
        this.colorFondo = colorFondo;
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        Word currentWord = getItem(position);
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listitem, parent, false);
        }

        TextView texto1 = listItemView.findViewById(R.id.miwok);
        texto1.setText(currentWord.getDescripcion());

        TextView texto2 = listItemView.findViewById(R.id.english);
        texto2.setText(currentWord.getLugar());

        ImageView imagen = listItemView.findViewById(R.id.icon);
        if (currentWord.getImagen() != 0) {
            imagen.setImageResource(currentWord.getImagen());
        } else {
            imagen.setVisibility(View.GONE);
        }


        LinearLayout textContainer = listItemView.findViewById(R.id.fondo);
        textContainer.setBackgroundResource(colorFondo);

        return listItemView;
    }

}


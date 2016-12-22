package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tom on 2016/12/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Word currentWord = getItem(position);

        View listItemView = convertView;

        if (listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView miwok = (TextView) listItemView.findViewById(R.id.miwok_text);

        miwok.setText(currentWord.getMiwokTranslation());

        TextView default_translation = (TextView) listItemView.findViewById(R.id.default_text);

        default_translation.setText(currentWord.getDefaulttranslation());

        return listItemView;

    }
}

package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tom on 2016/12/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColor_resourse_id;

    public WordAdapter(Activity context, ArrayList<Word> words, int color){
        super(context,0,words);
        mColor_resourse_id = color;
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

        ImageView img = (ImageView) listItemView.findViewById(R.id.list_item_image);

        if (currentWord.hasImage()){

            img.setImageResource(currentWord.getImage_resource_id());

        }else {
            img.setVisibility(View.GONE);
        }

        View background = listItemView.findViewById(R.id.list_item_word_background);

        int color = ContextCompat.getColor(getContext(),mColor_resourse_id);

        background.setBackgroundColor(color);

        return listItemView;

    }
}

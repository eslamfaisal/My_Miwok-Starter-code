package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eslam Faisal on 18/03/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter (Context context , List<Word> words){
        super(context,0,words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rootView = convertView;
        if (rootView == null){
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView miowkText = (TextView) rootView.findViewById(R.id.miwok);
        miowkText.setText(currentWord.getMiwok());

        TextView englishText = (TextView) rootView.findViewById(R.id.english);
        englishText.setText(currentWord.getEnglish());

        return rootView;
    }
}

package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        List<Word> words = new ArrayList<>();
        words.add(new Word("eslam","faisal"));
        words.add(new Word("eslam","faisal"));
        words.add(new Word("eslam","faisal"));
        words.add(new Word("eslam","faisal"));

        ListView listView = (ListView) findViewById(R.id.List);

        WordAdapter adapter = new WordAdapter(this, words);
        listView.setAdapter(adapter);

    }
}

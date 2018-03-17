package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        List<String> words = new ArrayList<>();
        words.add("eslam");
        words.add("faisal");
        Log.i("NumbersActivity",""+words.get(0));

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.my_Linear);
        int index = 0;
        while (index<words.size()) {
            TextView textView = new TextView(this);
            if (linearLayout != null) {
                linearLayout.addView(textView);
            }
            textView.setText(words.get(index));
            index++;
        }

    }
}

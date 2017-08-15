package com.example.hitesh0505.languagelove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/*
 * Since the layout of all activities is the same, we instead of using activity_colors, can refactor(change the name everywhere used in the java and xml)
 * the name of word_list as word_list or anything
 * so that the single layout can be used in four other activities instead of creating it again and again.
 * Also for this to happen, we've to delete tools:context="com.example.hitesh0505.languagelove.NumbersActivity" since
 * it represents opening that activity only i.e. here NumbersActivity.
 */

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        Word w = new Word("Color","Vishiya");
        words.add(w);
        // OR more consise way
        words.add(new Word("grey","shiqeth"));
        words.add(new Word("purple","reaven"));
        words.add(new Word("pink","theyaven"));
        words.add(new Word("brown","nozhoven"));
        words.add(new Word("green","dahaan"));
        words.add(new Word("yellow","veltor"));
        words.add(new Word("white","zasqa"));
        words.add(new Word("red","virzeth"));
        words.add(new Word("black","kazga"));

        WordAdapter itemsAdapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.numbers_list);
        listView.setAdapter(itemsAdapter);
    }
}



package com.example.hitesh0505.languagelove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        Word w = new Word("grandfather","simonoff");
        words.add(w);
        // OR more consise way
        words.add(new Word("grandmother","kristasof"));
        words.add(new Word("father","ave"));
        words.add(new Word("mother","mai"));
        words.add(new Word("elder brother","gaezo"));
        words.add(new Word("elder sister","inavva"));
        words.add(new Word("younger brother","valonqar"));
        words.add(new Word("younger sister","haedar"));
        words.add(new Word("sibling","dubys"));
        words.add(new Word("wife","abrazyrys"));
        words.add(new Word("daugther","tala"));
        words.add(new Word("husband","valzyrys"));
        words.add(new Word("niece","janise"));
        words.add(new Word("nephew","siera"));
        words.add(new Word("twins","idana"));
        words.add(new Word("son","tresy"));

        WordAdapter itemsAdapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.numbers_list);
        listView.setAdapter(itemsAdapter);

    }
}

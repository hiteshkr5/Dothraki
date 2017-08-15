package com.example.hitesh0505.languagelove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        Word w = new Word("What the fuck!","Ki fin yeni!");
        words.add(w);
        // OR more consise way
        words.add(new Word("Hi","M'athchomaroon"));
        words.add(new Word("Good morning!","Aena shekhikhi!"));
        words.add(new Word("How are you?","Hash yer dothrae chek?"));
        words.add(new Word("goodbye","Fonas chek!"));
        words.add(new Word("Be cool","Dothras chek"));
        words.add(new Word("Greeting to a non-dothraki","Athchomar chomakaan"));
        words.add(new Word("Will I see you again?","Hash anha atihak yera save?"));
        words.add(new Word("I will let you live","Anha vazhak yeraan thirat"));
        words.add(new Word("What is that?","Fini hazi?"));
        words.add(new Word("You’re wrong!","Yer ojila!"));
        words.add(new Word("Excellent!","Athdavrazar!"));
        words.add(new Word("Happy birthday","Asshekhqoyi vezhvena"));
        words.add(new Word("Get lost","Es havazhaan"));
        words.add(new Word("the loved one","jalan atthirari anni"));
        words.add(new Word("Your wish is my command","Ase shafki athdrivar"));
        words.add(new Word("Get him!","Fichas jahakes moon!"));
        words.add(new Word("No. No way!","Vos. Vosecchi!"));

        WordAdapter itemsAdapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.numbers_list);
        listView.setAdapter(itemsAdapter);
    }
}

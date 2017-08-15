package com.example.hitesh0505.languagelove;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

    /*
     * Creating an array and storing numbers in it. Arrays can store primitive as well as objects.
     * Arraylist can only store objects.
     * Arraylist is a Concrete class(not abstract class neither interface) and can change size so useful in dynamic listview changes.
     * Arraylist<E> is the generic form. It returns the E data type (E= element) which can take any value e.g. strings, objects etc.

        String[] words = new String[10];
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";
    }
    */

        ArrayList<Word> words = new ArrayList<Word>();

        Word w = new Word("one","at");
        words.add(w);
        // OR more consise way
        words.add(new Word("two","akat"));
        words.add(new Word("three","sen"));
        words.add(new Word("four","tor"));
        words.add(new Word("five","mek"));
        words.add(new Word("six","zhinda"));
        words.add(new Word("seven","fekh"));
        words.add(new Word("eight","ori"));
        words.add(new Word("nine","qazat"));
        words.add(new Word("ten","thi"));
        words.add(new Word("eleven","atthi"));
        words.add(new Word("twelve","akatthi"));
        words.add(new Word("thirteen","senthi"));
        words.add(new Word("fourteen","torthi"));
        words.add(new Word("fifteen","mekthi"));
        words.add(new Word("sixteen","zindatthi"));
        words.add(new Word("seventeen","fekhthi"));
        words.add(new Word("eighteen","oritthi"));
        words.add(new Word("nineteen","qazatthi"));
        words.add(new Word("twenty","chakat"));
        words.add(new Word("thirty","chisen"));
        words.add(new Word("fourty","chitor"));
        words.add(new Word("fifty","chimek"));
        words.add(new Word("sixty","chizhinda"));
        words.add(new Word("seventy","chifekh"));
        words.add(new Word("eighty","chori"));
        words.add(new Word("ninety","chiqazat"));
        words.add(new Word("hundered","ken"));
        words.add(new Word("thousand","dalen"));
        words.add(new Word("million","yor"));

        /*
            to print messages to log, Log.v("source activity","message to be printed);
            Log.v("NumbersActivity","Words at index 0: "+ words.get(0));
            words.remove(index number) is used to remove element from Arraylist words.
            words.get(index number) is used to get the element
            words.add() is used to add the element to the ArrayList.
         */

        // showing our xml view using java
/*

 THIS WAS ONE OF THE METHODS TO SHOW OUR VIEWS USING JAVA BUT IT'S NOT MEMORY SAVING HENCE WE'VE TO USE OTHER METHODS

        LinearLayout numbersActivityxml = (LinearLayout) findViewById(R.id.word_list);
        // adding our TextViews inside the LinearLayout, we use addView().
        // Input parameter of the TextView is Context i.e.

        for (int i = 0; i < words.size(); i++) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            numbersActivityxml.addView(wordView);
        }
*/

        // OTHER METHOD IS TO USE RECYLCYING VIEWS USING ARRAY ADAPTERS AND LISTVIEWS.
        // ArrayAdapter holds data and dynamically adds it to the view it is attached to.
        // ArrayAdapter is a concrete class, BaseAdapter is abstract class and ListAdapter is an interface.
        // ArrayAdapter<~>(Context, layout file, list of OBJECTS)
        /*
            BUT ArrayAdapter constructor only takes one item in it's list words, so we've to make a custom class for passing different type of layout.
         */
        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        //So now arrayadapter looks like
        // ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_view, words);
        // But ArrayAdapter only takes in a single textView as an input so we have to make a custom adapter of our own too.

        WordAdapter itemsAdapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.numbers_list);
        listView.setAdapter(itemsAdapter);
    }
}

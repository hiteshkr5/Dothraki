package com.example.hitesh0505.languagelove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.hitesh0505.languagelove.R.id.family;
import static com.example.hitesh0505.languagelove.R.id.numbers;
import static com.example.hitesh0505.languagelove.R.id.phrases;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FOUR
        // Creating a new object instance of the NumbersClickListener class/event listener in the main activity
        // NumbersClickListener firstClickListener = new NumbersClickListener();

        // Attaching the view to the click listener
        // TextView numberTextView = (TextView) findViewById(numbers);
        // numberTextView.setOnClickListener(firstClickListener);

        /*
         * FIVE
         * To be a good programmer, we've to be as consise as possible,
          * numberTextView.setOnclickListener( new NumbersClickListener());
          * or we even can't have to make any other java class
         * instead we can define it inline e.g.
         *
         * numberTextView.setOnClickListener( new OnClickListener(){
         *          @Override
         *          public void onClick(View view){
         *              do something on click.
         *          }}
         * ALL THE LISTENING EVENTS SHOULD BE PRESENT INSIDE THE ONCREATE METHOD ELSE THEY'LL NOT WORK
         */

        TextView numbersTextView = (TextView) findViewById(numbers);
        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersActivityIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersActivityIntent);
            }
        });


        TextView colorsTextView = (TextView) findViewById(R.id.colors);
         colorsTextView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent colorsActivityIntent = new Intent(MainActivity.this, ColorsActivity.class);
                 startActivity(colorsActivityIntent);
             }
         });

        TextView familyTextView = (TextView) findViewById(family);
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyActivityIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyActivityIntent);
            }
        });

        TextView phrasesTextView = (TextView) findViewById(phrases);
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesActivityIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesActivityIntent);
            }
        });

    }
    // ONE (priority of reading the comments as the video makes many changes)
    // There exists 2 types of intents- explicit (where you know which app/activity to open) like here
    // and implicit - (where you don't know which activity will be used to open like in just java app.
    // so method of decleration of intents is different for both types. Here we are using explicit intent definition.
    // Intent(activity which you're presently in i.i context, activity you want to open.class)
    //So explicit intents are mostly used in the same application.
    /*
     * Implicit intents use Action and Data URI
     * Explicit intents use Context and Component(usually class)
     */

    /*
     *TWO
     * this method openNumbersList was used if we declare onClick method inside the xml.
     *
    public void openNumbersList(View view){
        Intent intentForNumbersActivity = new Intent(this, NumbersActivity.class);
        startActivity(intentForNumbersActivity);
    }
    */

    /*
     * THREE
     * Using onClick in java instead of xml -- Steps are :
     * We've to define the event listener (in a new activity and not inside main activity)
     * Create a (new) object instance of the event listener(in the main activity)
     * Attach the listener to the view
     * When you define a listener using the onClick attribute, the view looks for a method with that name only in its host activity.
     * Programmatically setting an OnClickListener allows you to control a button's behavior from somewhere other than its host activity.
     * This will become very relevant when we learn about Fragments i.e mini activities.
     */
    // Defining event listener(it's a class not method) & since it's an abstract of OnclickListener so we've to implements some of it's methods.


}

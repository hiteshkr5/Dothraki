package com.example.hitesh0505.languagelove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/*
 * I'm not able to use this kind of approach since it's giving an error due to the input argument(this, NumbersActivity.class) of the Intent.
 * so better to use the consise method approach rather than this one.
 */
public class NumbersClickListener extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View view){
        // Do something on click.
        Intent numbersActivityIntent = new Intent(this, NumbersActivity.class);
        startActivity(numbersActivityIntent);
    }
}
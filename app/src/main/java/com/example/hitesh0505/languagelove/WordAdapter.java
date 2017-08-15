package com.example.hitesh0505.languagelove;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hitesh0505 on 18/03/17.
 */

/*
 * Here we are just overriding one method getView so as to change the layout view of Word class
 */
public class WordAdapter extends ArrayAdapter<Word>{

    // Creating the constructor is the most important thing of the class.

    public WordAdapter(Activity context, ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // Getting the object location at this position in the list
        Word currentWord = getItem(position);

        // Check if existing view (getView) is being recycled, else inflate it manually
        // For reusing the list
        View listItemView = convertView;
        // For making the list whenever it's not created for e.g. when we open the activity, we need the list to be created.
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view,parent,false);
        }

        // Find the TextViews in the list_view xml layout and set their text
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}

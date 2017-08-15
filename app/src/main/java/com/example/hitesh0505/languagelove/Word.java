package com.example.hitesh0505.languagelove;

/**
 * Created by hitesh0505 on 18/03/17.
 * Word class is will
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    // Defining the constructor is the most important thing of a class.
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    // since the variables are private, so in order to get them, we use getters
    // we won't provide setters because we don't want the translations to be set again.
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}

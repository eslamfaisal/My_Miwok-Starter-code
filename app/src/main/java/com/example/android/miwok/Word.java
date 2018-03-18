package com.example.android.miwok;

/**
 * Created by Eslam Faisal on 18/03/2018.
 */

public class Word {
    private String miwok;
    private String english;
    public Word(String miwok , String english){
        this.miwok = miwok ;
        this.english = english ;
    }
    public String getMiwok(){
        return this.miwok ;
    }
    public String getEnglish(){
        return this.english;
    }
}

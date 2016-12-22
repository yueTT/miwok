package com.example.android.miwok;

/**
 * Created by tom on 2016/12/17.
 */

public class Word {

    private String mMiwokTranslation;

    private String mDefaultTranslation;

    public Word(String defaulttranslation,String miwoktranslation ){
            mMiwokTranslation = miwoktranslation;
            mDefaultTranslation = defaulttranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getDefaulttranslation(){
        return mDefaultTranslation;
    }

}

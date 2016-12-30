package com.example.android.miwok;

/**
 * Created by tom on 2016/12/17.
 */

public class Word {

    private String mMiwokTranslation;

    private String mDefaultTranslation;

    private int mImage_resource_id = no_image_provided;

    private static final int no_image_provided = -1;

    private int mAudioResourceId;

    public Word(String defaulttranslation, String miwoktranslation) {
        mMiwokTranslation = miwoktranslation;
        mDefaultTranslation = defaulttranslation;
    }

    public Word(String defaulttranslation, String miwoktranslation, int resource_id, int audioId) {
        mMiwokTranslation = miwoktranslation;
        mDefaultTranslation = defaulttranslation;
        mImage_resource_id = resource_id;
        mAudioResourceId = audioId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaulttranslation() {
        return mDefaultTranslation;
    }

    public int getImage_resource_id() {
        return mImage_resource_id;
    }

    public boolean hasImage(){
        return mImage_resource_id != no_image_provided;
    }

    public  int getAudioResourceId(){
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImage_resource_id=" + mImage_resource_id +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}

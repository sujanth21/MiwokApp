package com.example.android.miwok;

/**
 * Created by Sujanth on 1/31/2017.
 */

public class Word {

    //Variables
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String miwokTranslation, String defaultTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceID = imageResourceID;
    }

    //Methods
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage () {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

}

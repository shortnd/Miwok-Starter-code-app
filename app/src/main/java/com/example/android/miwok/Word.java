package com.example.android.miwok;

/**
 * Created by owner on 6/4/17.
 */

public class Word {
    /** Default translation of the word */
    private String mDefaultTranslation;

    /** Miwok translation of the word */
    private String mMiwokTranslation;

    /** Image for the current word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**  */
    private int mAudioSourceId;
    /**
     * Create a new Word object
     *
     * @param defaultTranslation is the word in a language that the users default language is
     *
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioSourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioSourceId = audioSourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioSourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioSourceId = audioSourceId;
    }

    /**
     * Gets the default translation of the word.
     * @return
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Gets the Miwok translation of the word.
     * @return
     */
    public String getMiwokTranslation() {
        return  mMiwokTranslation;
    }


    /**
     * Gets the current word Resource Id
     */
    public int getImageResourceId() { return mImageResourceId; }

    /**
     * Returns whether or not there is an image for this word
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns the audio source Id to be played back
     */
    public int getAudioSourceId() { return mAudioSourceId; }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioSourceId=" + mAudioSourceId +
                '}';
    }
}

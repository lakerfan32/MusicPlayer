package com.example.ralph.musicplayer;

/**
 * Created by Ralph on 6/7/2018.
 * Creating a Custom class called Music.java.  Objects of this class will have 3 properties:
 * songName, artistName, imageResourceId
 */
public class Music {

    /**
     * Name of the Song
     */
    private String mSongName;

    /**
     * Name of the Artist
     */
    private String mArtistName;

    /**
     * Image resource ID for the album cover
     * and check whether list has image associated with it
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Music object.
     * @param songName is the name of the song
     * @param artistName is the name of the artist
     */
    public Music(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    /**
     * Create a secondary Music object with a third input.
     * @param songName is the name of the song
     * @param artistName is the name of the artist
     * @param imageResourceId is the drawable resource ID for the image associated with the album cover
     */
    public Music(String songName, String artistName, int imageResourceId) {
        mSongName = songName;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get method for the Song name
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get method for the Artist name
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Return the image resource ID of the album cover
     */
    public int getImageResourceId() { return mImageResourceId; }

    /**
     * Return whether or not there is an image associated with the list
     * by checking TRUE or FALSE
     */
    public boolean hasImage()  {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

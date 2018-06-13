package com.example.ralph.musicplayer;

/**
 * Created by Ralph on 6/7/2018.
 * Creating a Custom class called Song.java.  Objects of this class will have 2 properties:
 * songName, artistName
 */
public class Song {

    /**
     * Name of the Song
     */
    private String mSongName;

    /**
     * Name of the Artist
     */
    private String mArtistName;

    /**
     * Image resource ID for the song
     */
    private int mImageResourceId;

    /**
     * Create a new Song object.
     * @param songName is the name of the song
     * @param artistName is the name of the artist
     */
    public Song(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    /**
     * Create a secondary Song object with a third input.
     * @param songName is the name of the song
     * @param artistName is the name of the artist
     * @param imageResourceId is the drawable resource ID for the image associated with the Song
     */
    public Song(String songName, String artistName, int imageResourceId) {
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
     * Return the image resource ID of the song
     */
    public int getImageResourceId() { return mImageResourceId; }

}

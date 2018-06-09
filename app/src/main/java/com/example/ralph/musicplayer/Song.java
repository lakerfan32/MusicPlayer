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
     * Create a new Song object.
     * @param songName is the name of the song
     * @param artistName is the name of the artist
     */
    public Song(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
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
}

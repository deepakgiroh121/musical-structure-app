package com.example.android.musicalstructureapp;

public class song {

    // Songs name
    private String mSongName;

    // Artist name
    private String mArtistName;

    public song(String SongName, String ArtistName) {
        mSongName = SongName;
        mArtistName = ArtistName;
    }

    //song Name
    public String getSongName() {
        return mSongName;
    }

    //Artist Name
    public String getArtistName() {
        return mArtistName;
    }

}

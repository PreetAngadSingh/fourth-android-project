package com.example.musicplayer;

public class Song {
    private String mSongTitle;
    private String mSongArtist;
    private String mSongTime;
    //constructs calls to fill string
    public Song(String songTitle,String songArtist,String songTime){
        mSongTitle=songTitle;
        mSongArtist=songArtist;
        mSongTime=songTime;
    }
    public  String getSongTitle(){return mSongTitle;}
    public  String getSongArtist(){return mSongArtist;}
    public  String getSongTime(){return mSongTime;}
}

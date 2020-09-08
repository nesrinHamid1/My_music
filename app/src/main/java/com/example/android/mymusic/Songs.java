/**
 * this is the songs class
 * it contains mSongName, mAlbumName, mId (this id for the album art)
 * and a get method for all variables
 */
package com.example.android.mymusic;

public class Songs {

    private int mSongName;
    private int mAlbumName;
    private int mId;

    public Songs (int songName, int albumNam, int Id){
      mSongName = songName;
      mAlbumName = albumNam;
      mId = Id;
    }

    public int getSongName (){
        return mSongName;
    }

    public int getAlbumName (){
        return mAlbumName;
    }

    public int getSrc (){
        return mId;
    }

}

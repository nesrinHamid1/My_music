/**
 * this is a Parcelable class that help passing an objects SongsPlayerClass with an intent
 * to the Music Player Activity to present the right data in the Music Player Activity
 * @param mId is the id for the album art
 */
package com.example.android.mymusic;

import android.os.Parcel;
import android.os.Parcelable;

public class SongsPlayerClass implements Parcelable {

    private int mSongName;
    private int mAlbumName;
    private int mArtistName;
    private int mId;

    public SongsPlayerClass(int songName,int albumName,int artistName,int id){
        mSongName = songName;
        mAlbumName = albumName;
        mArtistName = artistName;
        mId = id;
    }
    protected SongsPlayerClass(Parcel in) {
        mSongName = in.readInt();
        mAlbumName = in.readInt();
        mArtistName = in.readInt();
        mId = in.readInt();
    }

    public static final Creator<SongsPlayerClass> CREATOR = new Creator<SongsPlayerClass>() {
        @Override
        public SongsPlayerClass createFromParcel(Parcel in) {
            return new SongsPlayerClass(in);
        }

        @Override
        public SongsPlayerClass[] newArray(int size) {
            return new SongsPlayerClass[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mSongName);
        parcel.writeInt(mAlbumName);
        parcel.writeInt(mArtistName);
        parcel.writeInt(mId);
    }

    public int getSongName (){
        return mSongName;
    }

    public int getAlbumName (){
        return mAlbumName;
    }

    public int getArtistName (){
        return mArtistName;
    }

    public int getId (){
        return mId;
    }
}

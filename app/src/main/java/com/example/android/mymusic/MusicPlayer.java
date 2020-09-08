package com.example.android.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicPlayer extends AppCompatActivity {
    SongsPlayerClass songs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_player);
        //getting the key from the intent with packages and store it in SongsPlayerClass object
        songs = getIntent().getParcelableExtra("key");
        // checking if the object is not null the call populateViews() to fill out the layout
        if(songs != null)
        {
            populateViews();
        }
    }
    // this function for assigning the Layout Views in Music Player to the
    // information coming from the intent package
    private void populateViews() {
        TextView songName = findViewById(R.id.songName);
        songName.setText(songs.getSongName());
        TextView albumName = findViewById(R.id.albumPlayerAlbumName);
        albumName.setText(songs.getAlbumName());
        TextView artistName = findViewById(R.id.albumPlayerArtistName);
        artistName.setText(songs.getArtistName());
        ImageView albumCover = findViewById(R.id.albumPlayerImage);
        albumCover.setImageResource(songs.getId());

    }
}
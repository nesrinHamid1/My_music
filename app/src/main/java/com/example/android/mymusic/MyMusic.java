package com.example.android.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MyMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        //this array list for all the songs in this activity
        final ArrayList<Songs> songs = new ArrayList<>();
        // this is a loop for adding all new songs in th songs list
        for (int i = 11; 1 <= i; i--){
            songs.add(new Songs(R.string.song_name + i,R.string.album_name + i,R.drawable.albumsquare + i));
        }
        // this is a custom adapter for the songs List
        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        ListView listView = findViewById(R.id.song_lists);

        listView.setAdapter(songsAdapter);
        // this is a setOnItemClickListener for the items in the songs list that have the index for every list
        // in the if statement it contains an intent to take us to the Music Player activity
        // also passing a package of Songs Player Class to theMusic Player activity with the needed information
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Intent recent = new Intent(MyMusic.this, MusicPlayer.class);
                    SongsPlayerClass songs1 = new SongsPlayerClass(songs.get(0).getSongName(),songs.get(0).getAlbumName(),R.string.artist_name11,R.drawable.albumplayer9);
                    recent.putExtra(getString(R.string.key),songs1);
                    startActivity(recent);
                }
                if(i == 1){
                    Intent recent = new Intent(MyMusic.this, MusicPlayer.class);
                    SongsPlayerClass songs1 = new SongsPlayerClass(songs.get(1).getSongName(),songs.get(1).getAlbumName(),R.string.artist_name10,R.drawable.albumplayer8);
                    recent.putExtra(getString(R.string.key),songs1);
                    startActivity(recent);
                }
                if(i == 2){
                    Intent recent = new Intent(MyMusic.this, MusicPlayer.class);
                    SongsPlayerClass songs1 = new SongsPlayerClass(songs.get(2).getSongName(),songs.get(2).getAlbumName(),R.string.artist_name9,R.drawable.albumplayer7);
                    recent.putExtra(getString(R.string.key),songs1);
                    startActivity(recent);
                }
                if(i == 3){
                    Intent recent = new Intent(MyMusic.this, MusicPlayer.class);
                    SongsPlayerClass songs1 = new SongsPlayerClass(songs.get(3).getSongName(),songs.get(3).getAlbumName(),R.string.artist_name8,R.drawable.albumplayer6);
                    recent.putExtra(getString(R.string.key),songs1);
                    startActivity(recent);
                }
                if(i == 4){
                    Intent recent = new Intent(MyMusic.this, MusicPlayer.class);
                    SongsPlayerClass songs1 = new SongsPlayerClass(songs.get(4).getSongName(),songs.get(4).getAlbumName(),R.string.artist_name7,R.drawable.albumplayer5);
                    recent.putExtra(getString(R.string.key),songs1);
                    startActivity(recent);
                }
                if(i == 5){
                    Intent recent = new Intent(MyMusic.this, MusicPlayer.class);
                    SongsPlayerClass songs1 = new SongsPlayerClass(songs.get(5).getSongName(),songs.get(5).getAlbumName(),R.string.artist_name6,R.drawable.albumplayer4);
                    recent.putExtra(getString(R.string.key),songs1);
                    startActivity(recent);
                }
                if(i == 6){
                    Intent recent = new Intent(MyMusic.this, MusicPlayer.class);
                    SongsPlayerClass songs1 = new SongsPlayerClass(songs.get(6).getSongName(),songs.get(6).getAlbumName(),R.string.artist_name5,R.drawable.albumplayer3);
                    recent.putExtra(getString(R.string.key),songs1);
                    startActivity(recent);
                }
                if(i == 7){
                    Intent recent = new Intent(MyMusic.this, MusicPlayer.class);
                    SongsPlayerClass songs1 = new SongsPlayerClass(songs.get(7).getSongName(),songs.get(7).getAlbumName(),R.string.artist_name4,R.drawable.albumplayer2);
                    recent.putExtra(getString(R.string.key),songs1);
                    startActivity(recent);
                }
                if(i == 8){
                    Intent recent = new Intent(MyMusic.this, MusicPlayer.class);
                    SongsPlayerClass songs1 = new SongsPlayerClass(songs.get(8).getSongName(),songs.get(8).getAlbumName(),R.string.artist_name3,R.drawable.albumplayer11);
                    recent.putExtra(getString(R.string.key),songs1);
                    startActivity(recent);
                }
                if(i == 9){
                    Intent recent = new Intent(MyMusic.this, MusicPlayer.class);
                    SongsPlayerClass songs1 = new SongsPlayerClass(songs.get(9).getSongName(),songs.get(9).getAlbumName(),R.string.artist_name2,R.drawable.albumplayer10);
                    recent.putExtra(getString(R.string.key),songs1);
                    startActivity(recent);
                }
                if(i == 10){
                    Intent recent = new Intent(MyMusic.this, MusicPlayer.class);
                    SongsPlayerClass songs1 = new SongsPlayerClass(songs.get(10).getSongName(),songs.get(10).getAlbumName(),R.string.artist_name1,R.drawable.albumplayer1);
                    recent.putExtra(getString(R.string.key),songs1);
                    startActivity(recent);
                }
            }
        });
    }
}
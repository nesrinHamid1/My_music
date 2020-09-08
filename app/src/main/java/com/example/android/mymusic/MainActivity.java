package com.example.android.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // this is the intent to the Game Playlist Activity
        ImageView gamingPlayList = findViewById(R.id.gamePlaylist);
        gamingPlayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recent = new Intent(MainActivity.this, GamePlayList.class);
                startActivity(recent);
            }
        });
        // this is the intent to the Lofi Playlist Activity
        ImageView lofiPlayList = findViewById(R.id.lofiPlaylist);
        lofiPlayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recent = new Intent(MainActivity.this, LofiPlayList.class);
                startActivity(recent);
            }
        });
        // this is the intent to the Recent Playlist Activity
        TextView recent = findViewById(R.id.recent);
        recent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent recent = new Intent(MainActivity.this, Recent.class);
                startActivity(recent);
            }
        });
        // this is the intent to the My Music Playlist Activity
        TextView myMusic = findViewById(R.id.my_music);
        myMusic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myMusic = new Intent(MainActivity.this, MyMusic.class);
                startActivity(myMusic);
            }
        });
        // this is the intent to the favorites Playlist Activity
        TextView favorites = findViewById(R.id.favorite);
        favorites.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent favorites = new Intent(MainActivity.this, Favorites.class);
                startActivity(favorites);
            }
        });
    }
}
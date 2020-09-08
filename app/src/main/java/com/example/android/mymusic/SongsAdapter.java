/**
 * this is the custom adapter for the Songs objects
 */
package com.example.android.mymusic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {

    public SongsAdapter (Activity context, ArrayList<Songs> songsList) {
        super(context, 0, songsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            View listItemView = convertView;

            if(listItemView == null){
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_item, parent, false);
            }

            Songs s = getItem(position);

            TextView songNameView = (TextView) listItemView.findViewById(R.id.songNamePlayList);
            songNameView.setText(s.getSongName());

            TextView albumNameView = (TextView) listItemView.findViewById(R.id.albumNamePlaylist);
            albumNameView.setText(s.getAlbumName());

            ImageView albumImage = (ImageView) listItemView.findViewById(R.id.albumCover);
            albumImage.setImageResource(s.getSrc());

            return listItemView;
    }
}

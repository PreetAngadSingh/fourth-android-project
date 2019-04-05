package com.example.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    private static final String LOG_TAG = SongAdapter.class.getSimpleName();
    public SongAdapter(Activity context, ArrayList<Song> songs){
        super(context,0,songs);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song currentWord=getItem(position);
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name);
        songTextView.setText(currentWord.getSongTitle());
        TextView secTextView = (TextView) listItemView.findViewById(R.id.song_artist);
        secTextView.setText(currentWord.getSongArtist());
        TextView thirdTextView = (TextView) listItemView.findViewById(R.id.song_time);
        thirdTextView.setText(currentWord.getSongTime());
        return listItemView;
    }
}

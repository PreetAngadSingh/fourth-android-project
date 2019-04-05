package com.example.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class Radio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button npbutton=(Button) findViewById(R.id.nowpbutton);
        npbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Radio.this,NowPlaying.class);
                startActivity(i1);
            }
        });
        ArrayList<String> songs=new ArrayList<String>();
        songs.add("Imagine Dragons");
        songs.add("Twenty one Pilots");
        songs.add("1 Billion Views");
        songs.add("Punjabi Hits");
        songs.add("Bhangra Beats");
        songs.add("Arijit Singh");
        songs.add("Bollywood Hits");
        songs.add("Romantic Bollywood");
        songs.add("Workout Music");
        songs.add("Hip-Hop");
        songs.add("Pop Music");
        songs.add("All Around the World");
        songs.add("Justin Bieber");
        songs.add("English Mix");
        songs.add("Punjabi Mix");
        songs.add("Hindi Mix");
        songs.add("Chill");
        songs.add("Classics");
        songs.add("Party");
        songs.add("EDM");
        songs.add("All that Jazz");
        songs.add("Love Notes");
        songs.add("Happy Tunes");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, songs);

        GridView gridView = (GridView) findViewById(R.id.grid);

        gridView.setAdapter(adapter);
    }
}

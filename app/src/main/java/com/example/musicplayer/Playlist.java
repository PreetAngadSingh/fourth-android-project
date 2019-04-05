package com.example.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button npbutton=(Button) findViewById(R.id.nowpbutton);
        npbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Playlist.this,NowPlaying.class);
                startActivity(i1);
            }
        });

        ArrayList<Song> songs=new ArrayList<Song>();
        songs.add(new Song("Natural","Imagine Dragons","3:09"));
        songs.add(new Song("Boomerang","Imagine Dragons","3:08"));
        songs.add(new Song("Machine","Imagine Dragons","3:02"));
        songs.add(new Song("Cool Out","Imagine Dragons","3:38"));
        songs.add(new Song("Bad Liar","Imagine Dragons","4:21"));
        songs.add(new Song("West Coast","Imagine Dragons","3:37"));
        songs.add(new Song("Zero","Imagine Dragons","3:31"));
        songs.add(new Song("Bullet in a Gun","Imagine Dragons","3:25"));
        songs.add(new Song("Digital","Imagine Dragons","3:21"));
        songs.add(new Song("Only","Imagine Dragons","3:01"));
        songs.add(new Song("Stuck","Imagine Dragons","3:11"));
        songs.add(new Song("Love","Imagine Dragons","2:46"));
        songs.add(new Song("Birds","Imagine Dragons","3:39"));
        songs.add(new Song("Burn Out","Imagine Dragons","4:34"));
        songs.add(new Song("Real Life","Imagine Dragons","4:08"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

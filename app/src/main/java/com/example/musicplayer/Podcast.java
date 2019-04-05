package com.example.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Podcast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button npbutton=(Button) findViewById(R.id.nowpbutton);
        npbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Podcast.this,NowPlaying.class);
                startActivity(i1);
            }
        });
        ArrayList<String> songs=new ArrayList<String>();
        songs.add("The Poland Story");
        songs.add("The Mild High Club");
        songs.add("Don't Do Drugs");
        songs.add("Raccoon Eggs");
        songs.add("No Mpre Parties at L.A.");
        songs.add("The Media Hates Us");
        songs.add("Mason's Mind");
        songs.add("We Went Camping");
        songs.add("We Took LSD");
        songs.add("His dad found out..");
        songs.add("Swagger was right...");
        songs.add("WE almost died");
        songs.add("Mason,s Mind");
        songs.add("Swagger is SO funny haha");
        songs.add("We ruined Christmas");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

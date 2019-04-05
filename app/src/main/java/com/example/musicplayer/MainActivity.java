package com.example.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        TextView playing=(TextView) findViewById(R.id.nowplaying);
        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,NowPlaying.class);
                startActivity(i1);
            }
        });
        TextView plist=(TextView) findViewById(R.id.playlist);
        plist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(MainActivity.this,Playlist.class);
                startActivity(i2);
            }
        });
        TextView radio=(TextView) findViewById(R.id.radio);
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(MainActivity.this,Radio.class);
                startActivity(i3);
            }
        });
        TextView ppodcast=(TextView) findViewById(R.id.podcast);
        ppodcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(MainActivity.this,Podcast.class);
                startActivity(i4);
            }
        });
    }
}

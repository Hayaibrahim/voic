package com.example.android.voic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
     private SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer voic = MediaPlayer.create(MainActivity.this,R.raw.so);

        Button first = (Button)findViewById(R.id.on);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voic.start();


            }
        });


        Button second = (Button)findViewById(R.id.off);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voic.stop();

            }
        });
        Button pause = (Button)findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voic.pause();
            }
        });

    }
}



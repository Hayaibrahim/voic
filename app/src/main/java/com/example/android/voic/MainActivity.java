package com.example.android.voic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] audio = {"music1", "music2", "music3"};
    ArrayAdapter<String> adapter;
    private SeekBar seekBar;
    private ListView mList;
    Button open ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList = (ListView) findViewById(R.id.Audio);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, audio);
        mList.setAdapter(adapter);
        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(), adapterView.getItemAtPosition(i) + "is selectsf", Toast.LENGTH_LONG).show();

            }
        });


        final MediaPlayer voic = MediaPlayer.create(MainActivity.this, R.raw.so);

        Button first = (Button) findViewById(R.id.on);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voic.start();


            }
        });


        Button second = (Button) findViewById(R.id.off);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voic.stop();

            }
        });
        Button pause = (Button) findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voic.pause();
            }
        });

    open = (Button) findViewById(R.id.youtube);
        open.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
                startActivity(i);
            }


    });
}







}



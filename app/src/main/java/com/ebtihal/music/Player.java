package com.ebtihal.music;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Player extends AppCompatActivity {
    Button start,stop,pause;
    TextView songn,singern;
    ImageView pic;
    MediaPlayer mp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        start=(Button) findViewById(R.id.start);
        pause=(Button) findViewById(R.id.pause);
        stop=(Button) findViewById(R.id.stop);
        singern = (TextView) findViewById(R.id.singer_name);
        songn = (TextView) findViewById(R.id.song_name);

        pic = (ImageView) findViewById(R.id.song_pic);

        Intent intent = getIntent();
        String song_name = intent.getStringExtra("song");


        switch (song_name){
            case "song1":
                try{
                    mp = MediaPlayer.create(this,R.raw.amr_diab_osad_einy);
                    singern.setText("Billie Eilish");
                    songn.setText("Beyleesh");
                    pic.setImageResource(R.drawable.bb);
                }catch(Exception e){e.printStackTrace();}
                break;
            case "song2":
                try{
                    mp = MediaPlayer.create(this,R.raw.wael_kfoury);
                    singern.setText("Billie Eilish");
                    songn.setText("bad guy");
                    pic.setImageResource(R.drawable.bbg2);

                }catch(Exception e){e.printStackTrace();}
                break;
            case "song3":
                try{
                    mp = MediaPlayer.create(this,R.raw.elissa_saat);
                    singern.setText("Billie Eilish");
                    songn.setText("lovely");
                    pic.setImageResource(R.drawable.bbg);

                }catch(Exception e){e.printStackTrace();}
                break;
        }


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                start.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        mp.start();
                    }

                });

            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mp.stop();
    }
}
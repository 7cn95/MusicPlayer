package com.ebtihal.music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout song1,song2,song3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song1 = (LinearLayout) findViewById(R.id.s1);
        song2 = (LinearLayout) findViewById(R.id.s2);
        song3 = (LinearLayout) findViewById(R.id.s3);

        Intent play = new Intent(this,Player.class);

        song1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                play.putExtra("song","song1");
                startActivity(play);
            }
        });
        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.putExtra("song","song2");
                startActivity(play);
            }
        });
        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.putExtra("song","song3");
                startActivity(play);
            }
        });

    }
}
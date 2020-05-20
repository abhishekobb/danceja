package com.danceja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnhip = findViewById(R.id.hiphopButton);
        ImageButton btnbal = findViewById(R.id.balletButton);
        ImageButton btnbha = findViewById(R.id.bhangraButton);
        ImageButton btnbhr = findViewById(R.id.bharatnatButton);

        btnhip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HiphopActivity.class);
                startActivity(intent);
            }
        });

        btnbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BalletActivity.class);
                startActivity(intent);
            }
        });

        btnbha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BhangraActivity.class);
                startActivity(intent);
            }
        });

        btnbhr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BharatnatyamActivity.class);
                startActivity(intent);
            }
        });
    }
}

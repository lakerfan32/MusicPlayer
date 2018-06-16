package com.example.ralph.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Set the content of the activity to use the activity_main.xml layout file
         */
        setContentView(R.layout.activity_main);

        /**
         * Find the View that shows the genres category and
         * set a click listener on that View
         */
        TextView genres = (TextView) findViewById(R.id.genres);

        genres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the genres category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GenresActivity}
                Intent genresIntent = new Intent(MainActivity.this, GenresActivity.class);

                // Start the new activity
                startActivity(genresIntent);
            }
        });

        /**
         * Find the View that shows the moods category and
         * set a click listener on that View
         */
        TextView moods = (TextView) findViewById(R.id.moods);

        moods.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the moods category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MoodsActivity}
                Intent moodsIntent = new Intent(MainActivity.this, MoodsActivity.class);

                // Start the new activity
                startActivity(moodsIntent);
            }
        });

        /**
         * Find the View that shows the artists category and
         * set a click listener on that View
         */
        TextView artists = (TextView) findViewById(R.id.artists);

        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        /**
         * Find the View that shows the all songs category and
         * set a click listener on that View
         */
        TextView songs = (TextView) findViewById(R.id.songs);

        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the all songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicActivity}
                Intent songsIntent = new Intent(MainActivity.this, MusicActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

    }
}

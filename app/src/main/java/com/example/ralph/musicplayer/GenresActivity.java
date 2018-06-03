package com.example.ralph.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class GenresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        /**
         * Create an array list of genre categories
         */
        ArrayList<String> genres = new ArrayList<String>();
        genres.add("Alternative/Indie");
        genres.add("Dance");
        genres.add("New Wave");
        genres.add("Oldies");
        genres.add("Pop");
        genres.add("Rap/Hip-Hop");

        /**
         *  Find the root view from genres activity
         */
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        /**
         * Keep looping until we've reached the end of the list (which means keep looping
         * as long as the current index position is less than the length of the list)
         */
        for (int index = 0; index < genres.size(); index++)

        {
            /**
             * Create a new TextView
             */
            TextView genreView = new TextView(this);

            /**
             * Set the text to be the genre at the current index
             */
            genreView.setText(genres.get(index));

            /**
             * Add this TextView as another child to the root view of this layout
             */
            rootView.addView(genreView);

        }
    }
}

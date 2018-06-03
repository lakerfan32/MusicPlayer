package com.example.ralph.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moods);

        /**
         * Create an array list of genre categories
         */
        ArrayList<String> moods = new ArrayList<String>();
        moods.add("80s Dance Party");
        moods.add("Chillin' While Grillin'");
        moods.add("Deep Focus");
        moods.add("Morning Indie Pop");
        moods.add("Rebel Yelling");
        moods.add("Sexy Saturdays");

        /**
         *  Find the root view from genres activity
         */
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        /**
         * Keep looping until we've reached the end of the list (which means keep looping
         * as long as the current index position is less than the length of the list)
         */
        for (int index = 0; index < moods.size(); index++)

        {
            /**
             * Create a new TextView
             */
            TextView moodView = new TextView(this);

            /**
             * Set the text to be the mood at the current index
             */
            moodView.setText(moods.get(index));

            /**
             * Add this TextView as another child to the root view of this layout
             */
            rootView.addView(moodView);

        }
    }
}

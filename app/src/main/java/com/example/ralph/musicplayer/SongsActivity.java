package com.example.ralph.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        /**
         * Create an array list of songs and artists
         */
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Come Together","Echosmith", R.drawable.talking_dreams));
        songs.add(new Song("Lay It All On Me","Rudimental", R.drawable.we_the_generation));
        songs.add(new Song("Hysteria","Def Leppard", R.drawable.best_of_def_leppard));
        songs.add(new Song("Daydream Believer","The Monkees", R.drawable.the_best_of_the_monkees));
        songs.add(new Song("Sugar","Maroon 5", R.drawable.v));
        songs.add(new Song("King Of Rock","RUN-DMC", R.drawable.run_dmc_greatest_hits));

        /**
         * Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
         * adapter knows how to create layouts for each item in the list, using the
         * simple_list_item_1.xml layout resource defined in the Android framework.
         * This list item layout contains a single {@link TextView}, which the adapter will set to
         * display a single word.
         */
        SongAdapter adapter = new SongAdapter(this, songs);

        /**
         * Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
         * There should be a {@link ListView} with the view ID called list, which is declared in the
         * activity_numbers.xml layout file.
         */
        ListView listView = (ListView) findViewById(R.id.list);

        /**
         * Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
         * {@link ListView} will display list items for each word in the list of words.
         * Do this by calling the setAdapter method on the {@link ListView} object and pass in
         * 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
         */
        listView.setAdapter(adapter);
    }
}

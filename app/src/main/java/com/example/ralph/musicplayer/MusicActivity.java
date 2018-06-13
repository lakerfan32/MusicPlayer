package com.example.ralph.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        /**
         * Create an array list of songs and artists
         */
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("A Sky Full Of Stars", "Coldplay", R.drawable.ghost_stories));
        music.add(new Music("Come Together","Echosmith", R.drawable.talking_dreams));
        music.add(new Music("Daydream Believer","The Monkees", R.drawable.the_best_of_the_monkees));
        music.add(new Music("Hysteria","Def Leppard", R.drawable.best_of_def_leppard));
        music.add(new Music("King Of Rock","RUN-DMC", R.drawable.run_dmc_greatest_hits));
        music.add(new Music("Lay It All On Me","Rudimental", R.drawable.we_the_generation));
        music.add(new Music("Pumped Up Kicks","Foster The People", R.drawable.torches));
        music.add(new Music("Sugar","Maroon 5", R.drawable.v));
        music.add(new Music("The Only Exception","Paramore", R.drawable.brand_new_eyes));
        music.add(new Music("The World As I See It","Jason Mraz", R.drawable.love_is_a_four_letter_word));

        /**
         * Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
         * adapter knows how to create layouts for each item in the list, using the
         * simple_list_item_1.xml layout resource defined in the Android framework.
         * This list item layout contains a single {@link TextView}, which the adapter will set to
         * display a single song.
         */
        MusicAdapter adapter = new MusicAdapter(this, music, R.color.category_songs);

        /**
         * Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
         * There should be a {@link ListView} with the view ID called list, which is declared in the
         * activity_songs.xml layout file.
         */
        ListView listView = (ListView) findViewById(R.id.list);

        /**
         * Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
         * {@link ListView} will display list items for each song in the list of songs.
         * Do this by calling the setAdapter method on the {@link ListView} object and pass in
         * 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
         */
        listView.setAdapter(adapter);
    }
}

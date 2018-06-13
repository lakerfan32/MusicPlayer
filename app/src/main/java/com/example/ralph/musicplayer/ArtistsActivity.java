package com.example.ralph.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        /**
         * Create an array list of artist categories
         */
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("","Capital Cities"));
        music.add(new Music("", "Coldplay"));
        music.add(new Music("", "Depeche Mode"));
        music.add(new Music("", "DMX"));
        music.add(new Music("", "Echosmith"));
        music.add(new Music("", "Foster The People"));
        music.add(new Music("", "Jason Mraz"));
        music.add(new Music("", "Missy Elliott"));
        music.add(new Music("", "Paramore"));
        music.add(new Music("", "Van Halen"));

        /**
         * Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
         * adapter knows how to create layouts for each item in the list, using the
         * simple_list_item_1.xml layout resource defined in the Android framework.
         * This list item layout contains a single {@link TextView}, which the adapter will set to
         * display a single word.
         */
        MusicAdapter adapter = new MusicAdapter(this, music, R.color.category_artists);

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

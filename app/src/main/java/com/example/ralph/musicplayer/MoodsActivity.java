package com.example.ralph.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moods);

        /**
         * Create an array list of mood categories
         */
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("","80s Dance Party"));
        music.add(new Music("", "Chillout Tunes"));
        music.add(new Music("", "Deep Focus"));
        music.add(new Music("", "Morning Indie Pop"));
        music.add(new Music("", "Rebel Yelling"));
        music.add(new Music("", "Sexy Saturdays"));

        /**
         * Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
         * adapter knows how to create layouts for each item in the list, using the
         * simple_list_item_1.xml layout resource defined in the Android framework.
         * This list item layout contains a single {@link TextView}, which the adapter will set to
         * display a single word.
         */
        MusicAdapter adapter = new MusicAdapter(this, music, R.color.category_moods);

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

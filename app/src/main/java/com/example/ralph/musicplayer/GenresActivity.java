package com.example.ralph.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GenresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        /**
         * Create an array list of genre categories
         */
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("","Alternative/Indie"));
        music.add(new Music("", "Dance"));
        music.add(new Music("", "oldies"));
        music.add(new Music("", "Pop"));
        music.add(new Music("", "Rap/Hip-Hop"));
        music.add(new Music("","Rock"));

        /**
         * Create an {@link MusicAdapter}, whose data source is a list of Strings. The
         * adapter knows how to create layouts for each item in the list.
         * This list item layout contains a single {@link ListView}, which the adapter will set to
         * display a single item.
         */
        MusicAdapter adapter = new MusicAdapter(this, music, R.color.category_genres);

        /**
         * Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
         * There should be a {@link ListView} with the view ID called list, which is declared in the
         * list_item.xml layout file.
         */
        ListView listView = (ListView) findViewById(R.id.list);

        /**
         * Make the {@link ListView} use the {@link MusicAdapter} we created above, so that the
         * {@link ListView} will display list items for each song in the category list.
         * Do this by calling the setAdapter method on the {@link ListView} object and pass in
         * 1 argument, with the variable name adapter.
         */
        listView.setAdapter(adapter);
    }
}

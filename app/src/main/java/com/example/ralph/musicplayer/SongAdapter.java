package com.example.ralph.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * of {@link Song} objects.
 */
public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * This is the custom constructor.
     * @param context is the current context, used to inflate the layout file
     * @param songs is the list of Songs objects to display in the list
     */
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID songs text view
        TextView songTextView = (TextView) listItemView.findViewById(R.id.songs_text_view);
        // Get the song name from the current currentSong object and set this text on the name songTextView
        songTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artists text view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artists_text_view);
        // Get the artist name from the currentSong object and set this text on the name artistTextView
        artistTextView.setText(currentSong.getArtistName());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Set the ImageView to the image resource specified in the current Song
        imageView.setImageResource(currentSong.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

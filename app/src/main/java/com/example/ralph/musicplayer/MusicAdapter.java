package com.example.ralph.musicplayer;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link MusicAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * of {@link Music} objects.
 */
public class MusicAdapter extends ArrayAdapter<Music> {

    /**
     * This is the Resource ID for the background color for each list of categories
     */
    private int mColorResourceId;

    /**
     * This is the custom constructor.
     * @param context is the current context, used to inflate the layout file
     * @param songs is the list of Song objects to display in the list
     * @param colorResourceId is the background color corresponding to each category list
     */
    public MusicAdapter(Activity context, ArrayList<Music> songs, int colorResourceId) {
        super(context, 0, songs);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Music} object located at this position in the list
        Music currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID songs text view
        TextView songTextView = (TextView) listItemView.findViewById(R.id.songs_text_view);
        // Get the song name from the current currentSong object and set this text on the name songTextView
        songTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artists text view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artists_text_view);
        // Get the artist name from the currentSong object and set this text on the name artistTextView
        artistTextView.setText(currentSong.getArtistName());

        /**
         * Find the ImageView in the list_item.xml layout with the ID image
         * and check if ImageView visibility is needed
         */
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentSong.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentSong.getImageResourceId());

            // Make sure the view is visible by default
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            // Otherwise, hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item based on the category
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

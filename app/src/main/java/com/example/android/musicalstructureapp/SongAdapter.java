package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<song> {

    public SongAdapter(Activity context, ArrayList<song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // check if an existing view is being refused, other wise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get the {@link word} object located at this position in the list
        song currentSong = getItem(position);

        // find the TextView in the list_Item.xml layout with the id song_text_view.
        TextView songTextView = listItemView.findViewById(R.id.song_text_view);

        songTextView.setText(currentSong.getSongName());

        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);

        artistTextView.setText(currentSong.getArtistName());

        return listItemView;

    }
}

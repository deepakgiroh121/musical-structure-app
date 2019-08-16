package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PunjabiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //create an array of words
        ArrayList<song> songs = new ArrayList<song>();
        songs.add(new song("Badnam", "Mankirat"));
        songs.add(new song("Nira Ishq", "Guri"));
        songs.add(new song("Yaar Ni Milyaa", "Hardy Sandhu"));
        songs.add(new song("Gal Karke", "Inder Chahal"));
        songs.add(new song("Hostel", "Sharry Mann"));

        // create an {@link ListView} object in the view hierachy of the {@link activity}.
        // adapter knows gow to create layout for each item in the list, using the
        // simple_list_item_1.xml layout resources defined in the android framework
        // this list item layout contain a single {@link textview} which the adapter will set the
        // display a single word.
        SongAdapter adapter =
                new SongAdapter(this, songs);

        // find the {@link ListView} object in the view hierarcy of the {@link Activity}.
        // there should be a {@link ListView} with the view id called list, which is declared in
        // activity_numbers.xml layout file
        ListView listView = findViewById(R.id.List);
        // make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will  display list item of each song in the list of songs.
        // do this bye calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name item adapter.
        listView.setAdapter(adapter);


    }

}

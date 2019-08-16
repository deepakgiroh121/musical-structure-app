package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.widget.ListView;

public class HindiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //create an array of words
        ArrayList<song> songs = new ArrayList<song>();
        songs.add(new song("Coca Cola","Frolic Neha Kakkar"));
        songs.add(new song("Nazm Nazm","Bareilly Ki Barfi"));
        songs.add(new song("Bekhayali","Kabir Singh"));
        songs.add(new song("Teri Mitti","Kesari"));
        songs.add(new song("Tere Bin","Simmba"));

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
        ListView listView = (ListView) findViewById(R.id.List);

        // make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will  display list item of each song in the list of songs.
        // do this bye calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name item adapter.
        listView.setAdapter(adapter);


    }
}

package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the hindi category
        final TextView hindi = findViewById(R.id.hindi);

        // Set a click listener on that View
        hindi.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the hindi category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HindiActivity}
                Intent hindiIntent = new Intent(MainActivity.this, HindiActivity.class);

                // Start the new activity
                startActivity(hindiIntent);
            }
        });

        // Find the View that shows the english category
        TextView english = findViewById(R.id.english);

        // Set a click listener on that View
        english.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the english category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EnglishActivity}
                Intent englishIntent = new Intent(MainActivity.this, EnglishActivity.class);

                // Start the new activity
                startActivity(englishIntent);
            }
        });

        // Find the View that shows the punjabi category
        TextView punjabi = findViewById(R.id.punjabi);

        // Set a click listener on that View
        punjabi.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the punjabi category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PunjabiActivity}
                Intent punjabiIntent = new Intent(MainActivity.this, PunjabiActivity.class);

                // Start the new activity
                startActivity(punjabiIntent);
            }
        });


    }
}
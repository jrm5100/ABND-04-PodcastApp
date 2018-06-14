package com.example.android.podcastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EpisodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.episode_list);

        // Get passed list of episodes back into an ArrayList
        Bundle bundle = getIntent().getExtras();
        Show show = (Show) bundle.get("show");
        ArrayList<Episode> episodes = show.getEpisodes();

        // Use the list adapter
        ListView listView = (ListView) findViewById(R.id.list);
        EpisodeAdapter adapter = new EpisodeAdapter(this, episodes);
        listView.setAdapter(adapter);

        // Set label
        setTitle(show.getName());


    }
}

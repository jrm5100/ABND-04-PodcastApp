package com.example.android.podcastapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EpisodeAdapter extends ArrayAdapter<Episode> {
    /**
     * Create a new {@link EpisodeAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param episodes is the list of {@link Show}s to be displayed.
     */
    public EpisodeAdapter(Context context, ArrayList<Episode> episodes) {
        super(context, 0, episodes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.episode_list_item, parent, false);
        }

        // Get the Show object located at this position in the list
        final Episode currentEpisode = getItem(position);

        // Set episode title
        TextView episodeNameView = (TextView) listItemView.findViewById(R.id.episode_name);
        episodeNameView.setText(currentEpisode.getEpisodeName());

        // Set episode description
        TextView showDescriptionView = (TextView) listItemView.findViewById(R.id.episode_description);
        showDescriptionView.setText(currentEpisode.getEpisodeDescription());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }


}

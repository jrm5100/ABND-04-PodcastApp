package com.example.android.podcastapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowAdapter extends ArrayAdapter<Show> {
    /**
     * Create a new {@link ShowAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param shows is the list of {@link Show}s to be displayed.
     */
    public ShowAdapter(Context context, ArrayList<Show> shows) {
        super(context, 0, shows);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.show_list_item, parent, false);
        }

        // Get the Show object located at this position in the list
        final Show currentShow = getItem(position);

        // Set onClick
        listItemView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent intent = new Intent(getContext(), EpisodeActivity.class);
                // Add Episode Data
                intent.putExtra("show", currentShow);
                // Start the new activity
                getContext().startActivity(intent);
            }
        });

        // Set show title
        TextView showNameView = (TextView) listItemView.findViewById(R.id.show_name);
        showNameView.setText(currentShow.getName());

        // Set show description
        TextView showDescriptionView = (TextView) listItemView.findViewById(R.id.show_description);
        showDescriptionView.setText(currentShow.getShowDescription());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }


}

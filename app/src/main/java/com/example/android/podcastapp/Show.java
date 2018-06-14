package com.example.android.podcastapp;

import java.io.Serializable;
import java.util.ArrayList;

public class Show implements Serializable {

    /* Name of the show */
    private String mName;

    /* Show Description */
    private String mShowDescription;

    /* List of episodes for the show */
    private ArrayList<Episode> mEpisodes;

    /**
     * Create a new Show object.
     *
     * @param showName is the name of the show
     * @param showDescription is a short description of the episode
     * @param episodes is an array of episode objects
     */
    public Show(String showName,
                String showDescription,
                ArrayList<Episode> episodes) {
        mName = showName;
        mShowDescription = showDescription;
        mEpisodes = episodes;
    }

    /* Getters */
    public String getName(){return mName;}
    public String getShowDescription(){return mShowDescription;}
    public ArrayList<Episode> getEpisodes(){return mEpisodes;}
}

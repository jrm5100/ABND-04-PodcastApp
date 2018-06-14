package com.example.android.podcastapp;

import java.io.Serializable;

public class Episode implements Serializable {

    /* Show Name */
    private String mShowName;

    /* Episode Name */
    private String mEpisodeName;

    /* Episode Description */
    private String mEpisodeDescription;

    /* Episode Length (s) */
    private int mEpisodeLength;

    /**
     * Create a new Episode object.
     *
     * @param showName is the name of the show
     * @param episodeName is the name of the episode
     * @param episodeDescription is a short description of the episode
     * @param episodeLength is the length of the episode in seconds
     */
    public Episode(String showName,
                   String episodeName,
                   String episodeDescription,
                   int episodeLength) {
        mShowName = showName;
        mEpisodeName = episodeName;
        mEpisodeDescription = episodeDescription;
        mEpisodeLength = episodeLength;
    }

    /* Getters */
    public String getShowName(){return mShowName;}
    public String getEpisodeName(){return mEpisodeName;}
    public String getEpisodeDescription(){return mEpisodeDescription;}
    public int getEpisodeLength(){return mEpisodeLength;}

}

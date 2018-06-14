package com.example.android.podcastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Add shows/episodes */
        ArrayList<Show> shows = new ArrayList<Show>();

        /* Programming Podcast Episodes */
        ArrayList<Episode> episodes_programming_podcast = new ArrayList<Episode>();
        episodes_programming_podcast.add(new Episode("Programming Podcast","Episode 1: HTML","HTML isn't really a programming language, but it's important to cover.",1806));
        episodes_programming_podcast.add(new Episode("Programming Podcast","Episode 2: CSS","CSS is used to style websites",1792));
        episodes_programming_podcast.add(new Episode("Programming Podcast", "Episode 3: Python", "Python is the best language.", 3590));
        episodes_programming_podcast.add(new Episode("Programming Podcast", "Episode 4: Javascript", "Let's take a look at the ES6 version of Javascript, and maybe talk about React", 3590));
        /* Add Programming Podcast to shows */
        shows.add(new Show("Programming Podcast",
                            "Programming Podcast is a podcast discussing various programming topics.",
                            episodes_programming_podcast));

        /* Parenting Podcast Episodes */
        ArrayList<Episode> episodes_parenting_podcast = new ArrayList<Episode>();
        episodes_parenting_podcast.add(new Episode("Parenting Podcast", "Episode 1: New Parents!", "What new parents should be expecting", 3605));
        episodes_parenting_podcast.add(new Episode("Parenting Podcast", "Episode 2: Preschool", "Do kids need preschool?  Is private school worth it?", 3619));
        episodes_parenting_podcast.add(new Episode("Parenting Podcast", "Episode 3: Boys vs Girls", "Which is harder to raise- boys or girls?  The debate rages on.", 3507));
        episodes_parenting_podcast.add(new Episode("Parenting Podcast", "Episode 4: Picky Eaters", "In this episode we discuss ideas for helping satisfy picky eaters.", 3590));
        episodes_parenting_podcast.add(new Episode("Parenting Podcast", "Episode 5: TV Shows", "Sesame Street is a classic, but when can you trust television?", 3610));
        /* Add Parenting Podcast to shows */
        shows.add(new Show("The Parenting Podcast",
                "The Parenting Podcast is all about discussing and commiserating over raising kids in the modern world.",
                episodes_parenting_podcast));

        /* Political Podcast Episodes */
        ArrayList<Episode> episodes_political_podcast = new ArrayList<Episode>();
        episodes_political_podcast.add(new Episode("Political Pundits", "Episode 1: Introductions!","Welcome to the newest political podcast on the web!  Time to introduce ourselves.", 28795));
        /* Add Political Podcast to shows */
        shows.add(new Show("Political Pundits",
                "A few political nerds get together and talk about issues that nobody cares about.",
                episodes_political_podcast));

        /* TV Podcast Episodes */
        ArrayList<Episode> episodes_tv_podcast = new ArrayList<Episode>();
        episodes_tv_podcast.add( new Episode("Popular TV Show Discussion", "Predictions for the new season", "What do we think will happen this season?", 1816));
        episodes_tv_podcast.add( new Episode("Popular TV Show Discussion", "Review of Episode 1", "Spoilers!  We cover the exciting season premiere.", 1812));
        episodes_tv_podcast.add( new Episode("Popular TV Show Discussion", "Review of Episode 2", "Episode 2 seems like a filler episode, but maybe not?", 1705));
        episodes_tv_podcast.add( new Episode("Popular TV Show Discussion", "Review of Episode 3", "Wow!  We catch up on all the exciting action from the 3rd episode.", 1850));
        episodes_tv_podcast.add( new Episode("Popular TV Show Discussion", "Review of Episode 4", "Episode 4 was the best of the season.  Let's talk about why.", 1923));
        episodes_tv_podcast.add( new Episode("Popular TV Show Discussion", "Review of Episode 5", "Episode 5 sucked.  Let's talk about why.", 1973));
        episodes_tv_podcast.add( new Episode("Popular TV Show Discussion", "Review of Episode 6", "Covering episode 6- where is the plot going?", 1973));
        episodes_tv_podcast.add( new Episode("Popular TV Show Discussion", "Review of Episode 7", "The penultimate episode- who, what, when, where, why?", 1803));
        episodes_tv_podcast.add( new Episode("Popular TV Show Discussion", "Review of Episode 8", "The season finale calls for a special double-length episode.", 3608));
        /* Add TV Podcast to shows */
        shows.add(new Show("Popular TV Show Discussion",
                "This podcast is all about the new hit TV show that everyone is watching.",
                episodes_tv_podcast));

        // Create an {@link ShowAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ShowAdapter adapter = new ShowAdapter(this, shows);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // show_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

//import Tweet;

/**
 * Created by AlanJ on 2018-01-16.
 */

public class ImportantTweet extends Tweet {
    ImportantTweet(String message) {
        super(message);
    }

    ImportantTweet(String message, Date date) {
        super(message, date);
    }
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}

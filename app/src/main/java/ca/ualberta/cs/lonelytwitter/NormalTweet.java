package ca.ualberta.cs.lonelytwitter;

import android.text.BoringLayout;

import java.util.Date;

/**
 * Created by AlanJ on 2018-01-16.
 */

public class NormalTweet extends Tweet {

    NormalTweet(String message) {
        super(message);
    }

    NormalTweet(String message, Date date) {
        super(message, date);
    }
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}

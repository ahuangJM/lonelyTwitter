package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by AlanJ on 2018-01-16.
 */

public class NotHappyMood extends Mood {
    NotHappyMood(String mood) {
        super(mood);
    }

    NotHappyMood(String mood, Date date) {
        super(mood, date);
    }

    public Boolean isHappy() {
        return Boolean.FALSE;
    }
}

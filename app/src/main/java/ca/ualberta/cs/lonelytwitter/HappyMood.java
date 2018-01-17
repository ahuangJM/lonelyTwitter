package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by AlanJ on 2018-01-16.
 */

public class HappyMood extends Mood {
    HappyMood(String mood) {
        super(mood);
    }

    HappyMood(String mood, Date date) {
        super(mood, date);
    }

    public Boolean isHappy() {
        return Boolean.TRUE;
    }
}

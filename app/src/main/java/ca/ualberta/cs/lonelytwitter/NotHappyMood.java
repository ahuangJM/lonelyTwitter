/*
* CMPUT 301
*
* Lab 4
*
* 2018-02-01
*
* JingMing Huang
*
* Copyright 2018. All rights reserved. Used by permission
 */
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

    public String isHappy() {
        return Boolean.FALSE.toString();
    }
}

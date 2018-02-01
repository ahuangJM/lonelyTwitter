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

/**
 * tweets that are normal
 */

import java.util.Date;

public class NormalTweet extends Tweet {
    NormalTweet(String message){
        super(message);
    }

    NormalTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}

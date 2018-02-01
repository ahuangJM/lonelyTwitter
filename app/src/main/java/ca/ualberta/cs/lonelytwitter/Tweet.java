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
 * tweet class for tweets
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }
    /**
     * @return Date tweet date
     * */
    public Date getDate(){
        return date;
    }
    /**
     * @param date today
     * */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     *
     * @return return importancy
     */
    public abstract Boolean isImportant();

    /**
     * for adapter
     * @return date and message with delimiter in between
     */
    public String toString() {
        return date.toString() + " | " + message;
    }

}

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by AlanJ on 2018-01-16.
 */

public abstract class Tweet {
    private String message;
    private Date date;

    Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140) {
            this.message = message;
        }
        else {
            throw new TweetTooLongException();
        }
    }
    public Date getDate() {
        return this.date;
    }
    public void setDate(Date newDate) {
        this.date = newDate;
    }
    public abstract Boolean isImportant();
}

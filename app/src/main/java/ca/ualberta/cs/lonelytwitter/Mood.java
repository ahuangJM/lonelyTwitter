package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by AlanJ on 2018-01-16.
 */

public abstract class Mood {
    private String mood;
    private Date date;
    Mood(String mood) {
        this.mood = mood;
        this.date = new Date();
    }
    Mood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }
    public void setMood(String mood) throws MoodNotExistException {
        if (mood == "Happy" || mood == "NotHappy") {
            this.mood = mood;
        }
        else {
            throw new MoodNotExistException();
        }
    }
    public String getMood() {
        return this.mood;
    }
    public void setDate(Date newDate) {
        this.date = newDate;
    }
    public Date getDate() {
        return this.date;
    }
    public abstract String isHappy();
}

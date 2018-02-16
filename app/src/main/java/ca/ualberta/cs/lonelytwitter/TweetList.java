package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by nbelayne on 2/13/18.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){

        tweets.add(tweet);
    }

    public void addTweet(Tweet tweet){
        if(this.tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        }
        this.tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet) {
        return this.tweets.contains(tweet);;
    }

    public Tweet getTweet(int index) {
        if (this.getCount() <= index) {
            throw new IndexOutOfBoundException();
        }
        return this.tweets.get(index);
    }

    public ArrayList<Tweet> getTweets(){

        Collections.sort(this.tweets);

        return tweets;
    }

    public void delete(Tweet tweet){

        tweets.remove(tweet);
    }

    public int getCount(){
        return this.tweets.size();
    }
}

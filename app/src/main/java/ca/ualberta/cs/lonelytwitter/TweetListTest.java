package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by nbelayne on 2/13/18.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("tweet1");
        Tweet tweet2 = new NormalTweet("tweet2");
        try{
            tweets.add(tweet1);
            assertTrue(true);
        }
        catch(IllegalArgumentException e) {
            assertTrue(false);
        }
        try{
            tweets.add(tweet1);
            assertTrue(false);
        }
        catch(IllegalArgumentException e) {
            assertTrue(true);
        }
        assertTrue(tweets.hasTweet(tweet1));
        assertFalse(tweets.hasTweet(tweet2));
        try{
            tweets.add(tweet2);
            assertTrue(true);
        }
        catch(IllegalArgumentException e) {
            assertTrue(false);
        }
        assertTrue(tweets.hasTweet(tweet2));
        tweets.delete(tweet1);
        assertFalse(tweets.hasTweet(tweet1));
        assertEquals(tweets.getTweet(0), tweet2);
    }
}

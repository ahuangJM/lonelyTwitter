package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.ListView;

import com.robotium.solo.Solo;

import junit.framework.TestCase;

public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {

    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

    public void setUp() throws Exception {
        this.solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        this.solo.finishOpenedActivities();
    }

    public void testAddingTweetToTheList() {
//        this.solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
//        this.solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet:");
//        this.solo.clickOnButton("Save");
//        assertTrue(solo.searchText("Test Tweet"));

//        this.solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
//        assertTrue(solo.searchText("Test Tweet"));
//        this.solo.clickOnButton("Clear");
//        assertFalse(this.solo.searchText("Test Tweet"));


        this.solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        this.solo.enterText((EditText) this.solo.getView(R.id.body), "");
        assertTrue(solo.searchText("Test Tweet"));
        this.solo.clickOnButton("Clear");
        assertFalse(this.solo.searchText("Test Tweet"));
    }

    public void testClickTweetList() {
        LonelyTwitterActivity activity = (LonelyTwitterActivity) this.solo.getCurrentActivity();
        this.solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        this.solo.clickOnButton("Clear");
        this.solo.enterText((EditText) this.solo.getView(R.id.body), "Tweet test");
        this.solo.clickOnButton("Save");
        this.solo.waitForText("Tweet test");
        final ListView oldTweetList = activity.getOldTweetList();
        Tweet tweet = (Tweet) oldTweetList.getItemAtPosition(0);
        assertEquals(tweet.getMessage(), "Tweet test");
        this.solo.clickInList(0);
        this.solo.assertCurrentActivity("wrong activity", EditTweetActivity.class);
        assertTrue(this.solo.waitForText("TextView"));
        this.solo.goBack();
        this.solo.assertCurrentActivity("Wrong activity", LonelyTwitterActivity.class);
    }
}
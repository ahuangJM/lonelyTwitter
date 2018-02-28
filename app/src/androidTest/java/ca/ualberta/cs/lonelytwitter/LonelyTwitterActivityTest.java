package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

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

}
package ca.ualberta.cs.lonelytwitter;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;


public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        String s = getIntent().getExtras().getString("stuff");

        ((TextView) findViewById(R.id.textView)).setText(s);
    }
}

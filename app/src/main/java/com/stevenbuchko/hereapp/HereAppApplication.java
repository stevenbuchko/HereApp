package com.stevenbuchko.hereapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class HereAppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, getString(R.string.parse_app_id), getString(R.string.parse_client_key));

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }



}

package cl.deeb.helpfood;

/**
 * Created by jamescortes on 02-07-17.
 */

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

import cl.deeb.helpfood.globals.Globals;

public class IntroApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        Globals.init(this);
    }
}


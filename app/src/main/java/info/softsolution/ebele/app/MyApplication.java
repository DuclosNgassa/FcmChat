package info.softsolution.ebele.app;

import android.app.Application;

import info.softsolution.ebele.helper.MyPreferenceManager;

/**
 * Created by ndanji-ngassa on 29.06.2017.
 */

public class MyApplication extends Application {

    public static final String TAG = MyApplication.class.getSimpleName();

    private static MyApplication instance;

    private MyPreferenceManager myPreferenceManager;

    @Override
    public void onCreate(){
        super.onCreate();
        instance = this;
    }

    public static synchronized MyApplication getInstance(){
        return instance;
    }

    public MyPreferenceManager getPrefManager() {
        if (myPreferenceManager == null) {
            myPreferenceManager = new MyPreferenceManager(this);
        }

        return myPreferenceManager;
    }
}

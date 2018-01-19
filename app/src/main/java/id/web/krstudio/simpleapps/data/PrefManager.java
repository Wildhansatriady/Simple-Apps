package id.web.krstudio.simpleapps.data;

import android.content.SharedPreferences;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by wildhan on 1/19/2018 in SimpleApp.
 * Keep Spirit!!
 */
@Singleton
public class PrefManager {
    private SharedPreferences mSharedPreferences;

    private static final String PREF_KEY_LOGIN = "pref.key.login";

    @Inject
    public PrefManager(SharedPreferences sharedPreferences) {
        mSharedPreferences = sharedPreferences;
    }

    public void putIsLogin(boolean isLoggedin){
        mSharedPreferences.edit().putBoolean(PREF_KEY_LOGIN,isLoggedin).apply();
    }

    public boolean isLoggedin(){
        return mSharedPreferences.getBoolean(PREF_KEY_LOGIN,false);
    }

}

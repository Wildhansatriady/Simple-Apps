package id.web.krstudio.simpleapps.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;
import id.web.krstudio.simpleapps.di.ApplicationContext;

/**
 * Created by wildhan on 1/19/2018 in SimpleApp.
 * Keep Spirit!!
 */
@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication.getBaseContext();
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    SharedPreferences provideSharedPreference(){
        return mApplication.getSharedPreferences("demo-pref",Context.MODE_PRIVATE);
    }
}

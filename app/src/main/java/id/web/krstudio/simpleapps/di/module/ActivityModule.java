package id.web.krstudio.simpleapps.di.module;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import id.web.krstudio.simpleapps.di.ActivityContext;

/**
 * Created by wildhan on 1/19/2018 in SimpleApp.
 * Keep Spirit!!
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}

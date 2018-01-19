package id.web.krstudio.simpleapps;

import android.app.Activity;
import android.content.Context;

import id.web.krstudio.simpleapps.di.component.ActivityComponent;
import id.web.krstudio.simpleapps.di.component.DaggerActivityComponent;
import id.web.krstudio.simpleapps.di.module.ActivityModule;

/**
 * Created by wildhan on 1/19/2018 in SimpleApp.
 * Keep Spirit!!
 */

public final class UtilsApp {
    public static ActivityComponent getActivityComponent(Context context) {
        ActivityComponent activityComponent = null;

        if (activityComponent == null) {
            activityComponent = DaggerActivityComponent.builder()
                    .activityModule(new ActivityModule((Activity) context))
                    .applicationComponent(SimpleApplication.get(context).getComponent())
                    .build();
        }
        return activityComponent;
    }
}

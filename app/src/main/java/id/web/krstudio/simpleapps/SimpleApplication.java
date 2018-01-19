package id.web.krstudio.simpleapps;

import android.app.Application;
import android.content.Context;

import id.web.krstudio.simpleapps.di.component.ApplicationComponent;
import id.web.krstudio.simpleapps.di.component.DaggerApplicationComponent;
import id.web.krstudio.simpleapps.di.module.ApplicationModule;

/**
 * Created by wildhan on 1/19/2018 in SimpleApp.
 * Keep Spirit!!
 */

public class SimpleApplication extends Application {
    protected ApplicationComponent applicationComponent;

    public static SimpleApplication get(Context context){
        return (SimpleApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }

}

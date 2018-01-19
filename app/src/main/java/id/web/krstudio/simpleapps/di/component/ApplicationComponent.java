package id.web.krstudio.simpleapps.di.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import id.web.krstudio.simpleapps.SimpleApplication;
import id.web.krstudio.simpleapps.data.PrefManager;
import id.web.krstudio.simpleapps.di.ApplicationContext;
import id.web.krstudio.simpleapps.di.module.ApplicationModule;

/**
 * Created by wildhan on 1/19/2018 in SimpleApp.
 * Keep Spirit!!
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(SimpleApplication simpleApplication);

    @ApplicationContext
    Context getContext();

    PrefManager getSharedPref();
}

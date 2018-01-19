package id.web.krstudio.simpleapps.di.component;

import dagger.Component;
import id.web.krstudio.simpleapps.LoginActivity;
import id.web.krstudio.simpleapps.di.PerActivity;
import id.web.krstudio.simpleapps.di.module.ActivityModule;

/**
 * Created by wildhan on 1/19/2018 in SimpleApp.
 * Keep Spirit!!
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(LoginActivity mainActivity);

}
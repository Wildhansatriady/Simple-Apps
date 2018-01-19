package id.web.krstudio.simpleapps.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by wildhan on 1/19/2018 in SimpleApp.
 * Keep Spirit!!
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
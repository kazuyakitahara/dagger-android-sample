package xyz.lipinc.daggersample.di;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import xyz.lipinc.daggersample.App;

/**
 * Created by kazuya on 2017/05/23.
 */

@Component(modules = {AndroidInjectionModule.class, MainActivityModule.class})
public interface AppComponent {
    void inject(App application);
}
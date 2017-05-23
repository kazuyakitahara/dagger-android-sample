package xyz.lipinc.daggersample.di;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import xyz.lipinc.daggersample.MainActivity;

/**
 * Created by kazuya on 2017/05/23.
 */

@Module(subcomponents = MainActivityComponent.class)
public abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityInjectorFactory(MainActivityComponent.Builder builder);
}

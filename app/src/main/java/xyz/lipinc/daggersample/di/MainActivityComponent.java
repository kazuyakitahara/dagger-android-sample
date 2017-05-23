package xyz.lipinc.daggersample.di;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import xyz.lipinc.daggersample.MainActivity;

/**
 * Created by kazuya on 2017/05/23.
 */

@Subcomponent
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

    }
}


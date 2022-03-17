package com.example.estudo.note.exemplo.dagger.app;

import android.app.Application;

import com.example.estudo.note.exemplo.dagger.module.PokedexModule;

public class App extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        initDagger();
    }

    private void initDagger() {
        component = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .pokedexModule(new PokedexModule())
                .build();
    }

    public static AppComponent getComponent() {
        return component;
    }
}

package com.example.estudo.note.exemplo.dagger.app;

import com.example.estudo.note.exemplo.dagger.activity.MainActivity;
import com.example.estudo.note.exemplo.dagger.app.AppModule;
import com.example.estudo.note.exemplo.dagger.module.PokedexModule;

import dagger.Component;

@Component(modules = {AppModule.class, PokedexModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}

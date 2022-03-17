package com.example.estudo.note.exemplo.dagger.module;

import com.example.estudo.note.exemplo.dagger.model.Pokedex;
import com.example.estudo.note.exemplo.dagger.model.Pokemon;
import com.example.estudo.note.exemplo.dagger.model.Treinador;

import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PokedexModule {

    @Provides
    public Pokemon providerPokemon() {
        return new Pokemon("Psyduck", "Agua");
    }

    @Provides
    public Treinador providerTreinador() {
        return new Treinador("Alexa", 24);
    }

    @Provides
    public Pokedex providerPokedex(Treinador treinador, Pokemon pokemon) {
        return new Pokedex(treinador, pokemon);
    }
}

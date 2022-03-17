package com.example.estudo.note.exemplo.dagger.model;

import java.util.List;

public class Pokedex {
    private Treinador treinador;
    private Pokemon pokemon;

    public Pokedex() {
    }

    public Pokedex(Treinador treinador, Pokemon pokemon) {
        this.treinador = treinador;
        this.pokemon = pokemon;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}

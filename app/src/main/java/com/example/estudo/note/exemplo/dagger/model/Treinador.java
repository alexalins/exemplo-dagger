package com.example.estudo.note.exemplo.dagger.model;

import java.util.Locale;

public class Treinador {
    private String nome;
    private int idade;

    public Treinador() {
    }

    public Treinador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

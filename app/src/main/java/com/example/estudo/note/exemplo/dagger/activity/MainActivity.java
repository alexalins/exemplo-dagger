package com.example.estudo.note.exemplo.dagger.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.widget.TextView;

import com.example.estudo.note.exemplo.dagger.R;
import com.example.estudo.note.exemplo.dagger.app.App;
import com.example.estudo.note.exemplo.dagger.model.Pokedex;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Pokedex pokedex;

    private TextView textTreinador, textPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        ((App) getApplication()).getComponent().inject(this);
        //
        init();
    }

    private void init() {
        textTreinador = findViewById(R.id.txt_treinador);
        textPokemon = findViewById(R.id.txt_pokemon);
        textTreinador.setText(pokedex.getTreinador().getNome() + " - " + pokedex.getTreinador().getIdade());
        textPokemon.setText(pokedex.getPokemon().getNome() + " - " + pokedex.getPokemon().getTipo());
    }
}
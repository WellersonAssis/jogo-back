package com.example.jogo.controller;

import  com.example.jogo.dominio.Jogo;

public class JogoController {

    public boolean isJogoValido(Jogo jogo) {
        return isNomeValido(jogo) && isCodjogoValido(jogo);

    }

    private boolean isNomeValido(Jogo jogo) {
        return (!jogo.getNome().isEmpty()) && jogo.getNome().length() >= 3;

    }

    public boolean isCodjogoValido(Jogo jogo) {
        if (jogo.getCodjogo().isEmpty()) return false;
        if (jogo.getCodjogo().length() < 2) return false;
        return jogo.getCodjogo().matches("(?=.*[a-zA-Z])(?=.*[0-9]).+");


    }
}
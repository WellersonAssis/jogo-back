package com.example.jogo.controller;

import  com.example.jogo.dominio.Jogo;

public class JogoController {

    public boolean isJogoValido(Jogo jogo) {

        return isNomeValido(jogo) && isCodjogoValido(jogo);

    }



    public boolean isNomeValido(Jogo jogo) {
        if ((jogo.getNome().isEmpty()) || jogo.getNome().length() < 3) {
            return false;
        }
        return true;
    }

    public boolean isCodjogoValido(Jogo jogo) {
        if (jogo.getCodjogo().isEmpty()) return false;
        if (jogo.getCodjogo().length() < 2) return false;
        if (jogo.getCodjogo().matches("(?=.*[a-zA-Z])(?=.*[0-9]).+")) return false ;


        return true;

    }

}
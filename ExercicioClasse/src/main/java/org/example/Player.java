package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String nPlayer;

    private boolean jogar;

    private List<Ficha> fichas = new ArrayList<>();

    public Player(String nPlayer, boolean jogar) {
        this.nPlayer = nPlayer;
        this.jogar = jogar;
    }

    @Override
    public String toString(){
        return this.getnPlayer();
    }
    public String getnPlayer() {
        return nPlayer;
    }

    public void setnPlayer(String nPlayer) {
        this.nPlayer = nPlayer;
    }

    public boolean isJogar() {
        return jogar;
    }

    public void setJogar(boolean jogar) {
        this.jogar = jogar;
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }
}

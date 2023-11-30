package org.example;

import java.util.ArrayList;
import java.util.List;

public class Mesa {

    String nMesa;
    String nMestre;
    String sistema;
    List<Player> players = new ArrayList<>();

    public Mesa(String nMesa, String nMestre, String sistema) {
        this.nMesa = nMesa;
        this.nMestre = nMestre;
        this.sistema = sistema;
    }

    public String getnMesa() {
        return nMesa;
    }

    public void setnMesa(String nMesa) {
        this.nMesa = nMesa;
    }

    public String getnMestre() {
        return nMestre;
    }

    public void setnMestre(String nMestre) {
        this.nMestre = nMestre;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public List<Player> getPlayers() {
        return players;
    }
    public List<String> playingPlayers(){
        List<String> jogando = new ArrayList<>();
        List<Player> players = this.getPlayers();
        int num;
        for (num = 0 ; num < players.size() ; num++){
            if (players.get(num).isJogar()){
                jogando.add(players.get(num).getnPlayer() + " vai Jogar");
            }
            else {
                jogando.add(players.get(num).getnPlayer() + " não vai Jogar");
            }
        }

        return jogando;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}



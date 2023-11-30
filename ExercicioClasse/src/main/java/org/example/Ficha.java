package org.example;

public class Ficha {

    String nPers;

    int vida;

    int nivel;

    String desc;

    public Ficha(String nPers, int vida, int nivel, String desc) {
        this.nPers = nPers;
        this.vida = vida;
        this.nivel = nivel;
        this.desc = desc;
    }


    @Override
    public String toString(){
        return this.getnPers();
    }

    public String getnPers() {
        return nPers;
    }

    public void setnPers(String nPers) {
        this.nPers = nPers;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}

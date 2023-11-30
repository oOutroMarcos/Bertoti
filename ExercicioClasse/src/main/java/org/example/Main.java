package org.example;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Mesa mesa1 = new Mesa("Mesa Principal","Thiaguinho","DnD");
            Ficha fJhuan = new Ficha("Bkisser",10,2,"Ratazana dos Inferno");
            Player Jhuan = new Player("Jhuan",true);

            Jhuan.getFichas().add(fJhuan);
            mesa1.getPlayers().add(Jhuan);

            Ficha fMarcos = new Ficha("Cadior",200,450,"Jogador de WoW");
            Player marcos = new Player("Marcos",false);

            marcos.getFichas().add(fMarcos);
            marcos.getFichas().add(fJhuan);
            mesa1.getPlayers().add(marcos);

            System.out.println(mesa1.getPlayers());
            System.out.println(mesa1.playingPlayers());
            System.out.println("Fichas do Marcola: " + mesa1.getPlayers().get(1).getFichas().toString());
            System.out.println( "Fichas do Jhuan:  " + mesa1.getPlayers().get(0).getFichas().toString());

        }
    }

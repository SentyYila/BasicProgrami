package oop.abstractizare.interfete;

import java.sql.SQLOutput;

public class Chelner  implements Serveste, Curata{
    @Override
    public void curataMasa(int numarMasa) {
        System.out.println("Chelnerul curata masa cu numarul" +numarMasa);
    }

    @Override
    public void servesteMancare(int numarComanda, String tipulDeMancare) {
        System.out.println("La comanda cu numarul " +numarComanda +" mancarea este " +tipulDeMancare);

    }
}

package Controller;

import Model.Citire;
import Model.Produs;
import View.Afisare;

public class ProgramPrincipal {

    public static void main(String[] args) {
        int alegere = Afisare.meniu();
        Produs[] produs = null;

        while (alegere != 0) {
            switch (alegere) {
                case 1:
                    produs = Citire.citesteDinFisier();
                    Afisare.afisareInformatii(produs);
                    break;
                case 2:
                    if (produs != null) {
                        Afisare.afisareProduseVandute(produs);
                    } else {
                        System.out.println("Optiunea nu este disponibila fara trimiterea fisierului.");
                    }
                    break;
                case 3:
                    if (produs != null) {
                        Afisare.afisareProduseVanzariMici(produs);
                    } else {
                        System.out.println("Optiunea nu este disponibila fara trimiterea fisierului.");
                    }
                    break;
                default:
                    System.out.println("Ati introdus o valoare invalida! Va rog reincercati!");
            }
            alegere = Afisare.meniu();
        }
        System.out.println("Program incheiat.");

    }

}



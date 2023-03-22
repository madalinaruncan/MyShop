package View;

import Model.Citire;
import Model.Produs;

public class Afisare {

    public static int meniu() {
        System.out.println("");
        System.out.println("***********************************MENIU**********************************");
        System.out.println("1. Citeste informatiile despre stocuri.");
        System.out.println("2. Afiseaza situatia stocului in urma vanzarilor.");
        System.out.println("3. Afiseaza lista cu produsele la care s-au inregistrat vanzari de sub 25%");
        System.out.println("0. Paraseste programul");
        return Citire.citesteIntreg("Introduceti optiunea: ");
    }

    public static void afisareInformatii(Produs produs[]) {
        System.out.println("_______________________________________________________________");
        System.out.println("|  Denumire  |    Tip    | StocInitial |  Vandute  |   Pret   |");
        System.out.println("|____________|___________|_____________|___________|__________|");
        for (int i = 0; i < produs.length; i++) {
            System.out.format("|%-12s|%-11s|%-13d|%-11d|%-10d|\n", produs[i].getDenumire(), produs[i].getTip(),
                    produs[i].getStocInitial(), produs[i].getVandute(), produs[i].getPret());
        }
        System.out.println("|____________|___________|_____________|___________|__________|");
    }

    public static void afisareProduseVandute(Produs produs[]) {
        int disponibile = 0;
        System.out.println("___________________________________________________");
        System.out.println("|  Denumire  |    Tip    | Disponibile |   Pret   |");
        System.out.println("|____________|___________|_____________|__________|");
        for (int i = 0; i < produs.length; i++) {
            if (produs[i].getVandute() > 0) {
                disponibile = produs[i].getStocInitial() - produs[i].getVandute();
                System.out.format("|%-12s|%-11s|%-13d|%-10d|\n", produs[i].getDenumire(), produs[i].getTip(),
                        disponibile, produs[i].getPret());
            }
        }
        System.out.println("|____________|___________|_____________|__________|");
    }

    public static void afisareProduseVanzariMici(Produs produs[]) {
        int valoareVanzari = 0;
        int procentVanzari = 0;
        System.out.println("______________________________________________________________________________");
        System.out.println("|  Denumire  |    Tip    | StocInitial |  Vandute  |   Pret   |ValoareVanzari|");
        System.out.println("|____________|___________|_____________|___________|__________|______________|");
        for (int i = 0; i < produs.length; i++) {
            procentVanzari = produs[i].getVandute() * 100 / produs[i].getStocInitial();
            if (procentVanzari <= 25) {
                valoareVanzari = produs[i].getVandute() * produs[i].getPret();
                System.out.format("|%-12s|%-11s|%-13d|%-11d|%-10d|%-14d|\n", produs[i].getDenumire(),
                        produs[i].getTip(), produs[i].getStocInitial(), produs[i].getVandute(), produs[i].getPret(),
                        valoareVanzari);
            }
        }
        System.out.println("|____________|___________|_____________|___________|__________|______________|");
    }
}

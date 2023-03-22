package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Citire {

    public static int citesteIntreg(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.println(text);
        int numar = scan.nextInt();
        return numar;
    }

    public static Produs[] citesteDinFisier() {
        try {
            BufferedReader fisier = new BufferedReader(
                    new FileReader("c:\\Users\\Madi\\eclipse-workspace\\Laborator5FP\\src\\Model\\informatiiStocuri.txt"));
            String text = fisier.readLine();
            int numarLinii = Integer.parseInt(text);
            Produs produs[] = new Produs[numarLinii];

            for (int i = 0; i < numarLinii; i++) {
                text = fisier.readLine();
                String separare[] = text.split(",");
                produs[i] = new Produs();
                produs[i].setDenumire(separare[0]);
                produs[i].setTip(separare[1]);
                produs[i].setStocInitial(Integer.parseInt(separare[2]));
                produs[i].setVandute(Integer.parseInt(separare[3]));
                produs[i].setPret(Integer.parseInt(separare[4]));
            }
            return produs;
        } catch (Exception e) {
            System.out.println("Citirea din fisier nu se poate executa.");
            return null;
        }
    }

}

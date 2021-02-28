package Tablice;

import java.util.Scanner;

public class Przykład8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] imie = new String[4];
        String[] rasa = new String[4];
        String[] klasa = new String[4];
        String[] broń = new String[4];

        System.out.println("Podaj Imie :");
        imie[0] = scanner.next();

        System.out.println("Podaj Rase:");
        rasa[0] = scanner.next();

        System.out.println("Podaj Klase :");
        klasa[0] = scanner.next();

        System.out.println("Wybierz Broń:");
        broń[0] = scanner.next();

        System.out.println(" Podgląd Twojej Postaci  ");
        System.out.println(" Imie : " + imie[0]);
        System.out.println(" Rasa : " + rasa[0]);
        System.out.println(" Klasa : " + klasa[0]);
        System.out.println(" Broń : " + broń[0]);

    }
}

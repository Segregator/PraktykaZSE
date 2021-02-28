package Tablice;

import java.util.Random;

public class Przykład7 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] TAB = {-12, 43, 64, -25, -96, 97, 102, 2, -192};
        int v1 = random.nextInt(9);
        int v2 = random.nextInt(9);
        if (TAB[v1] > TAB[v2]) {
            System.out.println("Liczba " + TAB[v1] + " jest większa od liczby " + TAB[v2]);
        }
        if (TAB[v1] < TAB[v2]) {
            System.out.println("Liczba " + TAB[v1] + " jest mniejsza od liczby " + TAB[v2]);
        }
        if (TAB[v1] == TAB[v2]) {
            System.out.println("Liczba " + TAB[v1] + " jest równa liczbie " + TAB[v2]);
        }
    }
}


package Wyjatki;

import java.util.Random;

public class Zadanie1 {
    public static void main(String[] args) {
        int[] TAB = new int[10];
        Random random = new Random();
        int v1;
        try {
            for (int i = 0; i < 11; i++) {
                v1 = random.nextInt(99);
                TAB[i] = v1;
                System.out.println(TAB[i]);
            }
        }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
                System.out.println("tablia jest już pełna nie można wpisać więcej danych");



        }

    }


}


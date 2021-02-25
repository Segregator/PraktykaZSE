package petle;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int wysokoscTrojkata = sc.nextInt();

        for(int i = 0; i < wysokoscTrojkata;i++ ){

            for (int j = 0; j <= i; j++){
                System.out.print("X ");

            }
            System.out.println();
        }

    }





}

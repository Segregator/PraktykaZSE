package Wyjatki;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanieod1do5 {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> arrayList = new ArrayList<>(n);
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < n; i++){
            int a = sc.nextInt();
            if(!arrayList.contains(a)){
                arrayList.add(a);
                System.out.println("dodany");
            }else{
                i--;
                System.out.println("niedodany");
            }
        }

        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }

        try{
            System.out.println("Które liczby chcesz usunac ?");
            for (int i = 0; i < 5; i++) {
                int A = sc.nextInt();
                System.out.println("Usuwam" + arrayList.get(A));
                arrayList.remove(A);
                for (int j = 0; j < arrayList.size(); j++){
                    System.out.print(arrayList.get(j) + " ");
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Zamienianie");
        for (int i = 0; i < 2; i++) {
            int A = sc.nextInt();
            System.out.println("Zamieniam " + arrayList.get(i));
            arrayList.set(i,A);
        }
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i) + " ");
        }
    }
}

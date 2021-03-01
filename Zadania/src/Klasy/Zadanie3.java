package Klasy;

public class Zadanie3 {
    public static void main(String[] args) {
        Trojkat mojTrojkat = new Trojkat();
        prostokat mojProstokat = new prostokat();
        if(mojTrojkat.getBokA() > mojProstokat.getBokA()){
            System.out.println(mojTrojkat.getBokA());
        }
        else {
            System.out.println(mojProstokat.getBokA());
        }
    }



}

package Dziedziczenie;

public class Main {
    public static void main(String[] args) {
       Kwadrat kwadrat = new Kwadrat(4);
       System.out.println(kwadrat.getPole());


        Pies pies = new Pies(4,4,"Burek","biala",200);
        pies.dajGlos();

        Spawacz spawacz = new Spawacz(15000,"Pelny" , true, true);
        spawacz.wykonujePrace();

    }

}

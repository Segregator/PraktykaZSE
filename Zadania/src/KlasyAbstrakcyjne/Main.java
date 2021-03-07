package KlasyAbstrakcyjne;

public class Main {
    public static void main(String[] args) {
        Pies pies = new Pies();
        pies.wiek();
        pies.rasa();

    Samochod samochod = new Samochod();
    samochod.jedz();
    samochod.zatrzymajSie();

   RodzajChleba rodzajChleba = new RodzajChleba();
   rodzajChleba.Rodzaj();
   rodzajChleba.chrupiace();
   rodzajChleba.pokrojone();
   rodzajChleba.kupione();
   rodzajChleba.zjedzone();

   pies.badzMilutki();
   pies.bawSie();

   Kwadrat kwadrat = new Kwadrat(10);
        System.out.println("\nObwód = " + kwadrat.obliczObwod());
        System.out.println("Pole =" + kwadrat.obliczPole());

    }
}

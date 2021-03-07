package KlasyAbstrakcyjne;

public class Samochod implements Pojazd{
    public Samochod() {
        super();
    }

    @Override
    public void jedz() {
        System.out.println("Jedzie");

    }

    @Override
    public void zatrzymajSie() {
        System.out.println("Zatrzymuje sie");

    }
}

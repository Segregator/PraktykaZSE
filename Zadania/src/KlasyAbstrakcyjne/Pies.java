package KlasyAbstrakcyjne;

public class Pies extends Zwierze implements ZwierzeDomowe {

    @Override
    public void wiek() {
        System.out.println("77");

    }

    @Override
    public void rasa() {
        System.out.println("Owczarek Kaukaski");

    }

    @Override
    public void badzMilutki() {
        System.out.println("Nie jest milutki");

    }

    @Override
    public void bawSie() {
        System.out.println("Bawi sie ");

    }
}

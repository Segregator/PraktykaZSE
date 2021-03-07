package KlasyAbstrakcyjne;

public class RodzajChleba extends Chleb{
    void Rodzaj(){
        System.out.println("Razowe");
    }

    @Override
    void chrupiace() {
        System.out.println("Nie");

    }

    @Override
    void pokrojone() {
        System.out.println("Tak");

    }
}

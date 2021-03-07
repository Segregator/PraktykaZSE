package Dziedziczenie;

public class Figura {
    private double bokA;
    private double pole;

    public Figura(double bokA) {
        this.bokA = bokA;

    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getPole() {
        return pole;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }

    public void obliczPole() {
        pole = bokA * bokA;
    }
}


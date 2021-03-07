package Dziedziczenie;

public class Prostokat extends Figura {
    private double bokB;
    private double pole;


    public Prostokat(double bokA, double bokB){
        super(bokA);
        this.bokB =bokB;

    }
    public void obliczPole(){
        pole = getBokA() * bokB;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }

    @Override
    public double getPole() {
        return pole;
    }

    @Override
    public void setPole(double pole) {
        this.pole = pole;
    }
}

package Klasy;

public class Trojkat

{

    private int podstawa;
    private int bokA;
    private int wysokosc;
    private double pole;
    private double obwod;
public Trojkat(){

}
    public Trojkat(int podstawa, int bok, int wysokosc) {
        this.podstawa = podstawa;
        this.bokA = bokA;
        this.wysokosc = wysokosc;
    }

    public int getPodstawa() {
        return podstawa;
    }

    public void setPodstawa(int podstawa) {
        this.podstawa = podstawa;
    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public double getObwod() {
        return obwod;
    }

    public void setObwod(double obwod) {
        this.obwod = obwod;
    }

    public void obliczPole(){
        pole = (bokA * wysokosc)/2;
    }

    public void obliczObwod(){
        obwod = bokA * 2 + podstawa;
    }
    public static void main(String[] args) {

        Trojkat mojTrojkat = new Trojkat();
        System.out.println(mojTrojkat.getPole());

    }
}




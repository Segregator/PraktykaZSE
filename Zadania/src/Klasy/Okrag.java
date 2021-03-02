package Klasy;

public class Okrag {
    private double pole;
    private double obwod;
    private int srednica;
    private int promien;
    private double pi = 3.14;

    public double getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public int getSrednica() {
        return srednica;
    }

    public void setSrednica(int srednica) {
        this.srednica = srednica;
    }

    public int getPromien() {
        return promien;
    }

    public void setPromien(int promien) {
        this.promien = promien;
    }

    public void obliczObwod(){
        obwod = 2 * pi * promien;
    }

    public void obliczPole(){
        pole = pi * promien * promien;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }

    public double getObwod() {
        return obwod;
    }

    public void setObwod(double obwod) {
        this.obwod = obwod;
    }

    public static void main(String[] args) {
        Okrag mojOkrag = new Okrag();



    }
}


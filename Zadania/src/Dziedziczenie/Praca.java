package Dziedziczenie;

public class Praca {
    private double pensja;
    private String etat;
    private boolean Fajna;

    public Praca(double pensja, String etat , boolean czyJestFajna){


    }
    public void wykonujePrace(){
        System.out.println("Wykonuje czynność");

    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public boolean isFajna() {
        return Fajna;
    }

    public void setFajna(boolean fajna) {
        this.Fajna = fajna;
    }
}

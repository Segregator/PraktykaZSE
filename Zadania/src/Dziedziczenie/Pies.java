package Dziedziczenie;

public class Pies extends Zwierze{
    private String siersc;
    private int dlugoscOgonu ;

    public Pies(int wiek, int iloscKonczyn, String nazwa , String siersc , int dlugoscOgonu){
        super(wiek, iloscKonczyn,nazwa);
        this.siersc = siersc;
        this.dlugoscOgonu = dlugoscOgonu;
    }

    public String getSiersc() {
        return siersc;
    }

    public void setSiersc(String siersc) {
        this.siersc = siersc;
    }

    public int getDlugoscOgonu() {
        return dlugoscOgonu;
    }

    public void setDlugoscOgonu(int dlugoscOgonu) {
        this.dlugoscOgonu = dlugoscOgonu;
    }
}

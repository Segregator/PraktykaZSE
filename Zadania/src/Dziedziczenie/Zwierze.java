package Dziedziczenie;

public class Zwierze {
   private int wiek;
   private int iloscKonczyn;
   private String nazwa;
   public Zwierze(int wiek, int iloscKonczyn ,String nazwa){
       this.wiek = wiek;
       this.iloscKonczyn = iloscKonczyn;
       this.nazwa = nazwa;

   }
   public void dajGlos(){
       System.out.println("Daje głos:");
   }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getIloscKonczyn() {
        return iloscKonczyn;
    }

    public void setIloscKonczyn(int iloscKonczyn) {
        this.iloscKonczyn = iloscKonczyn;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

}

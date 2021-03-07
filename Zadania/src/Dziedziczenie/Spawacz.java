package Dziedziczenie;

public class Spawacz extends Praca{
    boolean niebiezpieczna;

    public Spawacz(int pensja, String etat, boolean fajna, boolean niebiezpieczna){
        super(pensja,etat,fajna);
        this.niebiezpieczna = niebiezpieczna;

    }

    @Override
    public void wykonujePrace() {
        System.out.println("*Spawa*");;
    }
}

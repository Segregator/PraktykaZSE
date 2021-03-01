package Klasy;

public class prostokat {


    private int bokA = 3;
    private int bokB = 6;
    private int pole = bokA * bokB;
    private double przekatna;
public prostokat(){

}

    public prostokat(int bokA, int bokB){
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public int getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    public void obliczPole(){
        pole = bokA * bokB;
    }
    public void obliczPrzekantna() {
       przekatna = Math.sqrt(bokB * bokB + bokA * bokA);

    }

    public double getPrzekatna() {
        return przekatna;
    }

    public void setPrzekatna(double przekatna) {
        this.przekatna = przekatna;
    }

    public static void main(String[] args) {

        prostokat mojProstokat = new prostokat();
        System.out.println(mojProstokat.getPole());
        System.out.println(mojProstokat.getPrzekatna());


    }

}

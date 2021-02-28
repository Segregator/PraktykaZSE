package Tablice;

public class Przykład6 {
    public static void main(String[] args) {

        System.out.println();
        int[] arrayInt = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < arrayInt.length;i++){
            System.out.println("Array[" + i +"] = " + arrayInt[i]);

        }
        System.out.println("\n PO ODWRÓCENIU  ");
        System.out.println();

        int[] arrayInt2 = {8,7,6,5,4,3,2,1};
        for (int j = 0; j < arrayInt2.length;j++) {
            System.out.println("Array[" + j + "] = " + arrayInt2[j]);
        }
    }
}

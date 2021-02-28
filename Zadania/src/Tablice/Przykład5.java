package Tablice;

public class Przykład5 {
    public static void main(String[] args) {


        System.out.println();
        int[] arrayInt = {-12,43,64,-25,-96,97,102,2,-192};

        for (int i = 0; i < arrayInt.length;i++){
            System.out.println("Array[" + i +"] = " + arrayInt[i]);

        }
        System.out.println("\nPo zamianie liczb najwieksza z najmniejsza miejscami ");
        System.out.println();

        int[] arrayInt2 = {-12,43,64,-25,-96,97,-192,2,102};
        for (int j = 0; j < arrayInt2.length;j++) {
            System.out.println("Array[" + j + "] = " + arrayInt2[j]);
        }
    }
}

package Tablice;

public class Przykład5 {
    public static void main(String[] args) {

        System.out.println();
        int max = 0;
        int min = 0;

        int[] arrayInt = {-12,43,64,-25,-96,97,102,2,-192};

        for (int i = 0; i < arrayInt.length;i++){
            if (arrayInt[i] > max) max = arrayInt[i];
            if (arrayInt[i] < min) min = arrayInt[i];
            System.out.println("Array[" + i +"] = " + arrayInt[i]);
        }
        System.out.println("\nPo zamianie liczb najwieksza z najmniejsza miejscami ");
        System.out.println();


        for (int j = 0; j < arrayInt.length;j++) {
            if(arrayInt[j] == max){
                arrayInt[j] = min;
            }
            else if(arrayInt[j] == min) arrayInt[j] = max;
            System.out.println("Array[" + j + "] = " + arrayInt[j]);
        }
    }
}
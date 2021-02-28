package Tablice;

public class Przykład4 {
    public static void main(String[] args) {
        int[] numbers = {12, 655, 33, 45, 55, 78, 98, -45, 12, 444, 655, -11, 73, 67, 2, 5, -45, 55, 655};
        int A;
        do {
            A = 0;
            for (int i = 1; i < numbers.length;i++) {
                if (numbers[i - 1] > numbers[i]) {
                    int mvp = numbers[i - 1];
                    numbers[i - 1] = numbers[i];
                    numbers[i] = mvp;
                    A = 1;
                }
            }
        }
        while (A == 1);
        for (int j = 0; j < numbers.length; j++) {
            int x = 0;
            for (int i = j; i < numbers.length; i++) {
                if (numbers[j] == numbers[i] && i != j) {
                    if (numbers[i] != x) {
                        x = numbers[j];
                        System.out.println("Powtarza się : " + numbers[j]);
                    }
                }
            }
        }
    }
}
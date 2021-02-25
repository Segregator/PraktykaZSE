package petle;

public class Zadanie4 {
    public static void main(String[] args) {

        for(int i = 1; i < 11;i++) {
            for (int j = 1; j < 11; j++) {
                if(i * j %3 == 0 || i * j %2 ==0 ) {
                    System.out.print(i * j + "\t");
                }
                    else{
                        System.out.print("X" + "\t");
                    }

            }

            System.out.println();
        }
    }
}


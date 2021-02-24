package petle;

public class zadanie1 {
    public static void main(String[] args) {

        char firstLetterOfAnAlphabet = 'A';

        for  (int i = 0; i < 26; i++){

            if(i % 2 ==0)
            System.out.print(firstLetterOfAnAlphabet + "\t");
            firstLetterOfAnAlphabet++;
        }

    }
}

package lt.sda.javafundamentals.task7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3;
        int i;

        System.out.print(n1 + " " + n2);


        for (i = 2; i < number; ++i){
          n3 = n1 + n2;
            System.out.print( " " + n3);
          n1 = n2;
          n2 = n3;
        }

    }
}

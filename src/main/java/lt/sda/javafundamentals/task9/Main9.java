package lt.sda.javafundamentals.task9;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

        System.out.println( "Please insert number :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        for (int row = 1; row <= number; row++) {
            for (int i = 0; i < number; i++) {
                for (int col = 1; col < number * 2; col++) {
                    if (row == col || col == number * 2 - row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}


package lt.sda.javafundamentals.task13;

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite teksto eilute :");
        String text = scanner.nextLine();

        String[] splitString = text.split("\\s+");

        for (String str : splitString){
            System.out.println(str + " " + str + " ");

        }

    }
}

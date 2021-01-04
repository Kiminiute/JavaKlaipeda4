package lt.sda.javafundamentals.task12;
import java.util.Scanner;


public class Main12 {

        public static void main (String[]args){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Iveskite teksto eilute :");
            String text = scanner.nextLine();

            int resultSpace = 0;

            for (char c : text.toCharArray()) {
                    if (c == ' ') {
                        resultSpace++;
                    }
                }

            double percentage = (double) resultSpace / text.length() * 100;
            System.out.printf("%.0f%%", percentage);

        }
    }






















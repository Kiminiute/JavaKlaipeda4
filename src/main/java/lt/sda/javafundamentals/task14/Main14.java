package lt.sda.javafundamentals.task14;

import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Parašykite dvi raides");

        char pirmaRaide = scanner.next().charAt(0);
        char antraRaide = scanner.next().charAt(0);

        if (pirmaRaide < 'a' || pirmaRaide > 'z' || antraRaide < 'a' || antraRaide > 'z'){
            System.out.println("Neteisingas simbolis, prašome įveskite mažąją lotynišką raidę");
        } else {
            System.out.println( Math.abs(pirmaRaide-antraRaide));
            }

        }
    }


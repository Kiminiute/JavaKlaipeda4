package lt.sda.javafundamentals.task11;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

import java.util.Scanner;

public class Main11 {

    private static final String SUSTABDYMAS = "Stop";

    public static void main(String[] args) {

        Scanner sctext = new Scanner(System.in);
        System.out.println( "Iveskite zodi :");
        String inputText = sctext.nextLine();

        String ilgiausiasZodis = inputText;

        while (!inputText.equals(SUSTABDYMAS)) {
            System.out.println("Iveskite zodi : ");
            inputText = sctext.nextLine();

            if( inputText.length() > ilgiausiasZodis.length()){
                ilgiausiasZodis = inputText;
            } else if ( inputText.length() == 0){
                System.out.println( "No text provided");
            }
        }
            System.out.println(ilgiausiasZodis);
        }
    }



//    public static int count(){
//
//        int result = 0;
//        char s = ' ';
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Iveskite teksto eilute :");
//        String text = scanner.nextLine();
//
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == s)
//                result++;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//
//
//        System.out.println(count());





package lt.sda.javafundamentals.task8;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        float mathAction;

        System.out.println( "Please insert number 1:");
        Scanner scanner = new Scanner(System.in);
        float number1 = scanner.nextFloat();

        System.out.println( "Please insert number 2:");
        float number2 = scanner.nextFloat();

        System.out.println( "Please choose mathematical operation: + , -, :, * ");
        char symbol = scanner.next().charAt(0);

            switch (symbol) {
                case  '+':
                    mathAction = number1 + number2;
                    System.out.println("Sum is : " + mathAction);
                    break;
                case '-':
                    mathAction = number1 - number2;
                    System.out.println("Result is: " + mathAction);
                    break;
                case ':':
                    mathAction = number1 / number2;
                    System.out.println("Result is :" + mathAction);
                    break;
                case '*':
                    mathAction = number1 * number2;
                    System.out.println("Result is : " + mathAction);
                    break;
                default:
                    System.out.println("Invalid operation symbol. Can'not complete");
            }
        }
    }


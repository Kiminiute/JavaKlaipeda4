package lt.sda.javafundamentals.task10;
import java.util.Scanner;

public class Main10 {

    public static int getSum(int n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Please insert number :");
        int skaicius = scanner.nextInt();

        if (skaicius <= 0) return;

        System.out.println(getSum(skaicius));




    }
}

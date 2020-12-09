package lt.sda.javafundamentals.task6;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        System.out.println( "Suma yra" + " " + sumHarmonic(n));
    }

    static float sumHarmonic(float n)
    {
        int i;
        float s = 0.0f;

        if( n == 1) return 1;

        for (i = 1; i <= n; i++)
            s =  1/ n + (sumHarmonic(n-1));
        return s;
    }
}










package namu_Darbai.ProgrammRunner;

import java.util.Scanner;

public class LoopTasksExecutor {
        public void executeLoopTask1(){
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};                 // LOOP  1 uzduotis
        int skaicius = 8;
        for(int i:array1) {
            int i1 = i * skaicius;
            System.out.println( i1 );
        }
    }

    public void executeLoopTask2() {
        for (int i = 1; i <= 100; i++) {                               // LOOP 2 uzduotis
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }

    public void executeLoopTask22() {
        for (int i = 2; i <= 100; i = i+2) {                            // LOOP 2 uzduotis 2 VARIANTAS
                System.out.println( i );
            }


//    public void executeLoopTask44() {
//        for (int i = 1; i <= 4; i++) {                                // pasibandymas
//            for (int j = 4; j <= 4; j++) {
//                System.out.print(" * ");
//            }
//        }
//    }
       }


//        for (int i= 1; i <= 5; i++) {                                // pasibandymas 2
//            for (int e = 1; e <= 2; e++) {
//                System.out.print(i+ e+  " " );
//            }
//        }

    public void executeLoopTask3() {
        Scanner scan = new Scanner(System.in);                        // LOOP 3 uzduotis
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
            }
            if (i < number) {
                System.out.print(" ,");
            }
        }
    }

    public void executeLoopTask4() {
        for (int i = 1; i <= 100; i++) {                               // LOOP 4 uzduotis
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0 && i % 5 == 0)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

        public void executeLoopTask5(){
            for (int i = 3; i <= 100; i = i * 3) {                            // LOOP 5 uzduotis
                System.out.println(i);
            }
        }

}

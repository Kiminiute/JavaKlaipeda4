package basics.pirmiejiNamuDarbai;

public class ArrayTasksExecutor {


         public void executeArrayTask1() {
             int sum = 0;                                                     // ARRAY 1 uzduotis
             int[] array1 = {1, 7, 3, 10, 9};
             for (int i = 0; i < array1.length; i++) {
                 sum += array1[i];
             }
             System.out.println(sum);
         }

         public void executeArrayTask2() {
             int vidurkis = 0;                                             // ARRAY 2 uzduotis
             int suma = 0;

             int[] array1 = {1, 7, 3, 10, 9};
             for (int i = 0; i < array1.length; i++) {
                 suma += array1[i];
                 vidurkis = suma / array1.length;
             }
             System.out.println(vidurkis);
         }

         public void executeArrayTask3() {
             int[] array1 = {1, 7, 3, 10, 9};                        // ARRAY 3 uzduotis
             for (int i = 0; i < array1.length; i++) {
                 if (array1[i] % 2 != 0) {
                     System.out.println(array1[i]);
                 }
             }
         }

         public void executeArrayTask4() {
                 int[] array2 = {1, 7, 3, 10, 9};                        // ARRAY 4 uzduotis
                 int Min = array2[0];
                 int Max = array2[0];

                 for (int i = 0; i < array2.length; i++) {
                     if (array2[i] < Min) {
                         Min = array2[i];
                     }
                     if (array2[i] > Max) {
                         Max = array2[i];
                     }
                 }
                 System.out.println("Minimalus skaicius yra:" + " " + Min);
                 System.out.println("Maksimalus skaicius yra:" + " " + Max);
             }

             public void executeArrayTask5() {                                   // ARRAY 5 uzduotis

             int[] array3 = {1, 7, 3, 10, 9};
             int skaiciuSeka = array3[0];

             for (int i = array3.length; i >= 1; i--) {
             System.out.print( skaiciuSeka + " ");
             }
             }

}


package advanced.collections.exeptions;

public class ArrayIndexOutOfBoudariesExeptionExample {

    public static void main(String[] args) {

        int[] arr = {510, 564};
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array index is out of bounds! Array length = " + arr.length);
        }
        System.out.println( "Programa baige darba sekmingai");

    }
}

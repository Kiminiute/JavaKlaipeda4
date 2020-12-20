package advanced.collections.interfaces.example_2;

public class Main {
    public static void main(String[] args) {

        Baloon baloon = new Baloon(54);
        Plane plane = new Plane(580);

        System.out.println("Maksimalus greiciai");
        System.out.println(baloon.maxSpeed());
        System.out.println(plane.maxSpeed());

        System.out.println(" Ar TP gali skristi?");
        System.out.println(baloon.canFly("bad"));
        System.out.println(plane.canFly("bad"));
    }
}

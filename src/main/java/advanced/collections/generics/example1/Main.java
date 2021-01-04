package advanced.collections.generics.example1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(5);

        GenericBox<String> box1 = new GenericBox<>("text");
        box1.getItem();

        GenericBox<Car> box2 = new GenericBox<>(car);

    }
}

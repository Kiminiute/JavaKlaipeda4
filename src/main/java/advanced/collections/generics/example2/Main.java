package advanced.collections.generics.example2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motocycle motocycle = new Motocycle();

        Garage<Car> carGarage = new Garage<>(car);
        carGarage.repairVehicle();

        Garage<Motocycle> motocycleGarage = new Garage<>(motocycle);
        motocycleGarage.repairVehicle();

    }

}

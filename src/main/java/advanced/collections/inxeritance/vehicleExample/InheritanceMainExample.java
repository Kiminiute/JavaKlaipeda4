package advanced.collections.inxeritance.vehicleExample;

public class InheritanceMainExample {

    public  static void main(String[]args) {

        Car myCar = new Car ("Volvo", 50);
        System.out.println(myCar.toString());

     // System.out.println(myCar.getMaxSpeed()); // paveldimas is tevines klases
        System.out.println(myCar.vehicleMaxSpeed());

        // negalima sukurti abstanciu klasiu instance;
        //  Vehicle vehicle = new Vehicle() {
        //   }
    }
}


package advanced.collections.inxeritance.vehicleExample;

public abstract class Vehicle {

    protected int maxSpeed;                 // kintamasis
    public  abstract int vehicleMaxSpeed(); // kintamasis

    public Vehicle(int maxSpeed){  // konstruktorius
        this.maxSpeed =maxSpeed;
    }

    public int getMaxSpeed(){      // metodas
        return maxSpeed;
    }




}

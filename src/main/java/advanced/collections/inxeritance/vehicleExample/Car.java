package advanced.collections.inxeritance.vehicleExample;

public class Car extends Vehicle {

    private String model;

    public Car(String model, int maxSpeed){  // konstruktorius
        super(maxSpeed);
        this.model = model;
    }

    public String getModel(){
        return  model;
    }

    public  int getMaxSpeed(){
        return  getMaxSpeed();
    }

    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed * 15;
    }

    @Override
    public String toString(){
        return "Car{" +  model + "maxSpeed=" + getMaxSpeed() +"} ";
    }

}

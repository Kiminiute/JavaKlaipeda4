package advanced.collections.classes.static_classes.non_staticclasses;

public class Bicycle {

    private int maxSpeed;

    public  Bicycle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public  int getMaxSpeed(){
        return maxSpeed;
    }

    //inner class
    public  class Wheel {
        public void damage(){
            maxSpeed *= 0.5;
        }

    }
}

package advanced.collections.interfaces.example_2;

public class Plane extends AirTransport implements Fly {

    public Plane(int speed){          //konstruktorius
        super(speed);
    }

    @Override
    public int maxSpeed() {
        return 0;
    }

    @Override
    public boolean canFly(String condition) {
        return true;
    }
}


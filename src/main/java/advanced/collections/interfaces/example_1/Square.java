package advanced.collections.interfaces.example_1;

public class Square implements Shape {

    private double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    @Override
    public double getArea() {
        return lenght * lenght;
    }

    @Override
    public double getPerimeter() {
        return lenght * 4;
    }
}

package advanced.collections.interfaces.example_1;

public class Rectangle implements Shape{

    private  double length;
    private double width;

    public Rectangle(double length, double width) {    //konstruktorius
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return length * width;
    }

    @Override
    public double getPerimeter(){
        return 2* length + 2 * width;
    }

}

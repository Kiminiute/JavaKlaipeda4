package namu_Darbai.Shape;

public class Circle extends Shape {

    public double radius;
    public double circleArea;
    public double circlePerimeter;
    String shapeDescription = "Circle";

    @Override
    public String display() {
        return shapeDescription;
    }

    @Override
    public double getArea() {
        circleArea = Math.pow(radius, 2) * Math.PI;          // metodas plotui skaiciuoti
        return circleArea;
    }

    @Override
    public double getPerimeter(){
        circlePerimeter = 2 * Math.PI * radius;             // metodas perimetrui skaiciuoti
        return circlePerimeter;
    };


    public Circle(double radius){                            //konstruktorius
        this.radius = radius;
    }

}

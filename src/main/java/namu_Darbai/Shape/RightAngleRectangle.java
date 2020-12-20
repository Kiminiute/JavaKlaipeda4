package namu_Darbai.Shape;

public class RightAngleRectangle extends Shape {

    private double width;
    private double hight;
    private double rightAngleRectangleArea;
    String shapeDescription = "RightAngleRectangle";

    public RightAngleRectangle(double width, double hight){     // konstruktorius;
        this.width = width;
        this.hight = hight;
    }

    @Override
    public double getArea() {
        rightAngleRectangleArea = (width * hight) /2;           // metodas plotui
        return rightAngleRectangleArea;
    }

    @Override
    public String display() {
        return shapeDescription;
    }

    public double getWidth() {
        return width;
    }

    public double getHight() {
        return hight;
    }
}

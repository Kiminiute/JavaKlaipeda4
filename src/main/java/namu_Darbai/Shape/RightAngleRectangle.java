package namu_Darbai.Shape;

public class RightAngleRectangle extends Shape {

    protected double width;
    protected double height;

    public RightAngleRectangle(String shapeDescription,double width, double hight){     // konstruktorius;
        super(shapeDescription);
        this.width = width;
        this.height = hight;
    }

    public double getWidth() {
        return width;
    }

    public double getHight() {
        return height;
    }

    protected double getArea() {            // metodas plotui
        return (width * height) /2;
    }

    @Override
    protected double getPerimeter() {
        return (double) height * width /2;
    }


}

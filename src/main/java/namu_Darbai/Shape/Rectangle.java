package namu_Darbai.Shape;

public class Rectangle extends RightAngleRectangle {

    String shapeDescription = "Rectangle";
    double rectangleArea;


    public Rectangle(double width, double height){                // konstruktorius
        super(width,height);
    }

    @Override
    public double getArea() {
        rectangleArea = super.getHight() * super.getWidth();      // metodas plotui
        return rectangleArea;
    }

    @Override
    public String display() {
        return shapeDescription;
    }

}

package namu_Darbai.Shape;

public class Rectangle extends RightAngleRectangle {

    double rectangleArea;

    public Rectangle(String shapeDescription, double width, double height) {                // konstruktorius
        super(shapeDescription, width, height);
    }


    @Override
    protected double getArea() {
        return height * width;   // metodas plotui
    }

}

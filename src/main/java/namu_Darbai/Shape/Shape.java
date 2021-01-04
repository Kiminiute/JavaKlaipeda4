package namu_Darbai.Shape;

public abstract class Shape {

    private String shapeDescription;
    private double area;
    private double perimeter;

    public Shape (String shapeDescription) {
        this.shapeDescription = shapeDescription;
    }

    public String getShapeDescription() {
        return shapeDescription;
    }

    protected abstract double getArea() ;


    protected abstract double getPerimeter();

    }



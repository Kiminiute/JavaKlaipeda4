package basics.tdd.NamuDarbai_2.Shape;

public abstract class Shape {

    private String shapeDescription;
    private double area;
    private double perimeter;


    public String display(){
        return  shapeDescription;
    }

    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }
}


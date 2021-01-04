package namu_Darbai.Shape;

 public class Circle extends Shape {

     public double radius;


     public Circle(String shapeDescription, double radius) {   //konstruktorius
         super(shapeDescription);
         this.radius = radius;
     }

     @Override
     public double getArea() {
         return Math.pow(radius, 2) * Math.PI;                // metodas plotui skaiciuoti
     }


     @Override
     public double getPerimeter() {
         return  2 * Math.PI * radius;             // metodas perimetrui skaiciuoti
     }


 }




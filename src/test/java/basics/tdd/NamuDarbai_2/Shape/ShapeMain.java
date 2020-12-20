package basics.tdd.NamuDarbai_2.Shape;

public class ShapeMain {

    public static void main(String[] args) {

        Shape shape1 = new Circle(4);
        Shape shape2 = new Rectangle(10, 10);
        Shape shape3 = new RightAngleRectangle(5, 5);

        System.out.println("Figuros - " + shape1.display() + " - plotas yra : " + shape1.getArea());
        System.out.println("Figuros - " + shape1.display() + " - perimetras yra : " + shape1.getPerimeter());
        System.out.println("Figuros - " + shape2.display() + " - plotas yra : " + shape2.getArea());
        System.out.println("Figuros - " + shape3.display() + " - plotas yra : " + shape3.getArea());
    }
}

//    Susikurti abstrakčią klasę `Shape` ir jį paveldėti:
//        * `Shape` klasė privalo turėti lauką: `shapeDescription`;
//        * Susikurti objektą `Circle` su lauku `radius`;
//        * Susikurti objektą `RightAngleRectangle` su laukais `width`, `height`;
//        * Susikurti objektą `Rectangle` ir paveldėti objektą RightAngleRectangle;
//        * Inicializuoti sukurtus `Circle`, `RightAngleRectangle` ir `Rectangle` objektus;
//        * Apskaičiuoti apskritimo plotą ir ilgį;
//        * Apskaičiuoti stataus trikampio plotą - ```(a*b)/2``` ir stačiakampio plotą;
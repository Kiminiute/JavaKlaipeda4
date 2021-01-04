package namu_Darbai.Shape;

public class ShapeMain  {

    public static void main(String[] args) {

        Shape shape1 = new Circle ("Apskritimas", 1);
        Shape shape2 = new Rectangle("Stačiakampis", 10, 10);
        Shape shape3 = new RightAngleRectangle("Status trikampis", 5, 5);


        System.out.println("Apskritimo plotas yra : " + shape1.getArea());
        System.out.println("Apskritimo ilgis yra : " + shape1.getPerimeter());
        System.out.println("Stačiakampio plotas yra :"  + shape2.getArea());
        System.out.println("Stataus trikampio plotas yra : " + shape3.getArea());
        System.out.println( );
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
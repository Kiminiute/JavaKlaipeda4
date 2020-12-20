package advanced.collections.classes.static_classes.non_staticclasses;

public class NestedNonStaticExample {

        public  static  void main (String[]args){

            Bicycle bicycle = new Bicycle(20);
            System.out.println(bicycle.getMaxSpeed());

            Bicycle.Wheel wheel = bicycle.new Wheel();
            wheel.damage();

            System.out.println(bicycle.getMaxSpeed());
        }
}

package advanced.collections;

public class AnonymousClassExample {

    public static void main(String[] args) {

        AbstractPlantClass plantClass = new AbstractPlantClass() {

            @Override
            public String getPlantName() {
                return "Klevas";
            }
        };

        System.out.println(plantClass.getPlantName());
    }
}

package advanced.collections.classes.static_classes.local_classes;

public class LocalClassExample {

    public static void main(String[] args) {
        System.out.println("Local class example! ");

   //     if (int i =0; i< 10; i++){

   //     }
        class  Pair {
            String key;
            int value;

            public  Pair(String key, int value){
                this.key = key;
                this.value = value;
            }
        }
        // local class uz kokio metodo ar kt {} nebus matoma;
        //Pair pair = new Pair();
       // pair.key = "k1";
       // pair.value =  1;
    }
}

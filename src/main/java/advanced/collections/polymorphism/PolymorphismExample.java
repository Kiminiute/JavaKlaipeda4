package advanced.collections.polymorphism;

public class PolymorphismExample {

    public static void main(String[] args) {

        RemoteController remote = new TvRemoteController();
                remote.enable(true);

                remote = new AcRemoteController();
                remote.enable(false);

                printTv(new TvRemoteController());
                printAc(new AcRemoteController());

    }
    public static void printTv(TvRemoteController remote){
        System.out.println(remote.getClass().getSimpleName());
    }
    public static void printAc(AcRemoteController remote){
        System.out.println(remote.getClass().getSimpleName());
    }
}

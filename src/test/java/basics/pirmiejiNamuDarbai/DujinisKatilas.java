package basics.pirmiejiNamuDarbai;

public class DujinisKatilas {
    private double temperatura;

    public DujinisKatilas(double temperatura){
        this.temperatura = temperatura;
    }

    private static String Modelis = "Bosch10";

    public static void getmodel() {
        System.out.println("Modelis " + Modelis);
    }
    public void katilasSildo() {
        System.out.println();
    }

}

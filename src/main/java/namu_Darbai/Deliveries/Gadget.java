package namu_Darbai.Deliveries;

public class Gadget extends Deliveries {

    public GadgetType gadgetType;
    double price;
    public Courier courier;
    public String mostExpensiveGadget;

    public Gadget(GadgetType gadgetType, double price, Courier courier){
        this.gadgetType = gadgetType;
        this.price = price;
        this.courier = courier;
    }

    public GadgetType getGadgetType() {
        return gadgetType;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public Courier getCourier() {
        return courier;
    }


    public Gadget getMostExpensiveGadget(){
        double maxPrice = 0;
        Gadget mostExpensiveGadget = null;

        if (maxPrice > price){
            price = maxPrice;
            Gadget gadget = mostExpensiveGadget;
        }
        return mostExpensiveGadget;
    }

}

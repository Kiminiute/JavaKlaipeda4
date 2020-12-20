package namu_Darbai.Deliveries;

public class Gadget extends Deliveries {

    public class Gadget {

        private double price;
        private  GadgetType gadgetType;
        private Courier courier;

        public Gadget(double price, GadgetType gadgetType, Courier courier) {
            this.price = price;
            this.gadgetType = gadgetType;
            this.courier = courier;
        }

        public GadgetType getGadgetType() {
            return gadgetType;
        }

//        @Override
//        public double getPrice() {
//            return price;
//        }


    }
}

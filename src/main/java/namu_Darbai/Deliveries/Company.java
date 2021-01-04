package namu_Darbai.Deliveries;

public class Company extends Deliveries {

    String name;
    String address;
    String mostExpensiveGadgetCompany;
    private Gadget gadget;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String displayAddress() {
        return address;
    }

    public Company(String name, String address, Gadget gadget){      //konstruktorius
        super.name = name;
        super.address = address;
        this.gadget = gadget;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public Company getMostExpensiveGadgetCompany(){
        Company mostExpensiveGadgetCompany = null;
        Gadget gadget = null;

        if (Gadget gadget = gadget.getMostExpensiveGadget()){
            Company company = mostExpensiveGadgetCompany;
        }
        return mostExpensiveGadgetCompany;
    }


}

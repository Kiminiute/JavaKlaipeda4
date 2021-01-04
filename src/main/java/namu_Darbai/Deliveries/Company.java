package namu_Darbai.Deliveries;

public class Company extends Deliveries {

    String name;
    String address;
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

    public Company getMostExpensiveGadgetCompany(Company company){
        Company mostExpensiveGadgetCompany;
        Gadget gadget;

        if (Gadget gadget = gadget.getMostExpensiveGadget()) {
            company = mostExpensiveGadgetCompany;
            company.getName();
        }
        return mostExpensiveGadgetCompany;
    }


}

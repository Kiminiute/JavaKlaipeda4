package basics.tdd.NamuDarbai_2.Deliveries;

public class Company extends Deliveries {
    String name;
    String address;
    String mostExpensiveGadgetCompany;
    private Gadget gadget;

    @Override
    public String display() {
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

//    public String getMostExpensiveGadgetCompany() {
//        return mostExpensiveGadgetCompany;
//    }

    public void setMostExpensiveGadgetCompany(String mostExpensiveGadgetCompany) {
        this.mostExpensiveGadgetCompany = mostExpensiveGadgetCompany;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

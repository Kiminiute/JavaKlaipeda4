package namu_Darbai.Deliveries;
import java.util.Date;

public class Person extends Deliveries {

    String name;
    String deliveryAddress;
    GadgetType gadgetType;
    int deliverUntill;
    int Date;

    public Person(String name, String deliveryAddress, GadgetType gadgetType, int Date){  // konstruktorius
    this.name = super.name;
    this.deliveryAddress = deliveryAddress;
    this.gadgetType = gadgetType;
    this.Date = Date;
    }

    void setTime(Date date){
    }

}

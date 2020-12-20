package basics.tdd.NamuDarbai_2.Deliveries;
import java.sql.Time;
import java.util.Date;

public class Person extends Deliveries {

    String name;
    String deliveryAddress;
    Enum gadgetType;
    int deliverUntill;
    int Date;

    public Person(String name, String deliveryAddress, Enum gadgetType, int Date){  // konstruktorius
    this.name = super.name;
    this.deliveryAddress = deliveryAddress;
    this.gadgetType = super.type;
    this.deliverUntill = deliverUntill;
    }

    void setTime(Date date){
    }

}

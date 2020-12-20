package basics.tdd.NamuDarbai_2.Deliveries;

public class Courier extends Deliveries{

    public String name;
    public String deliveredFrom;
    public int date;

    public Courier(String name, String deliveredFrom, int date){   //konstruktorius
        super.name = name;
        this.deliveredFrom = deliveredFrom;
        this.date = date;
    }



}

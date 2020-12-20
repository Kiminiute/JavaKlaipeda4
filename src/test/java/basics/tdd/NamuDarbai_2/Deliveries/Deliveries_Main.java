package basics.tdd.NamuDarbai_2.Deliveries;

import static basics.tdd.NamuDarbai_2.Deliveries.GadgetType.*;


public class Deliveries_Main {

       public static void main(String[] args) {

        Person person1 = new Person("Jonas", "Danes g.15", PHONE, 2020-12-12);
        Person person2 = new Person("Antanas", "Sausio g.178", LAPTOP ,  2021-3-18);
        Person person3 = new Person("Petras", "Molo g.87", TV , 2021-9-8);

        Gadget gadget1 = new Gadget(2000, PHONE,"Telia");
        Gadget gadget2 = new Gadget(4090, LAPTOP,"Bite");
        Gadget gadget3 = new Gadget(570, TV, "Tele2");
        Gadget []gadgets = new Gadget[3];

//        Company company1 = new Company("Telia","Klaipeda", PERSONAL_COMPUTER);
//        Company company2 = new Company("Bite","Vilnius", LAPTOP);
//        Company company3 = new Company("Tele2","Kaunas", TV);

        Company[]companies = new Company[3];
        Company mostExpenciveGadgetCompany = companies[0];

            for(int i = 0; i < companies.length; i++)
            if (mostExpenciveGadgetCompany.getPrice() > companies[i].getPrice()) {
                mostExpenciveGadgetCompany = companies[i];
            }
    //        System.out.println(mostExpenciveGadgetCompany.getMostExpensiveGadgetCompany());
        }

    }
    // new Company(“Tele2”, “Kaunas”, new Gadget(TV, 2000, new Courier(“Antanas”, “Klaipeda”, 2020-07-12)))


// Deliveries:
//        * Susikurti 5 objektus: `Company`, `Gadget`, `GadgetType`, `Courier`, `Person`

//        * Person turi talpinti laukus (`name`, `deliveryAddress`, `gadgetType`, `deliverUntil`);
//        * Company turi talpinti laukus (`name`, `companyAddress`, `gadget`);
//        * Gadget turi talpinti (`gadgetType`, `price`, `courier`);
//        * Courier turi talpinti (`name`, `deliveredFrom`', `deliveryDate`)
//        * GadgetType turi talpinti tipus -> (PHONE, LAPTOP, TV, PERSONAL_COMPUTER, MICRO_CONTROLLER);

//        * Inicializuoti 3 `Person` objektus. Vienas `Person` objektas privalo turėti 1-3 `Gadget` objektus;
//        * Privaloma naudoti abstrakčia klasę;
//        * Atvaizduoti `Company` objektą kuris turi brangiausią `Gadget` objektą;
//        * Atvaizduoti kurie žmonės gaus VISAS siuntas laiku;
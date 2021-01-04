package namu_Darbai.Deliveries;
import java.util.*;

import static namu_Darbai.Deliveries.GadgetType.*;


public class Deliveries_Main {

    public static void main(String[] args) {

        Person person1 = new Person("Jonas", "Danes g.15", PHONE, 2020 - 12 - 12);
        Person person2 = new Person("Antanas", "Sausio g.178", LAPTOP, 2021 - 3 - 18);
        Person person3 = new Person("Petras", "Molo g.87", TV, 2021 - 9 - 8);

        Company company1 = new Company("Telia", "Klaipeda", new Gadget(PHONE, 2000, new Courier("DPD", "Klaipeda", 2020 - 12 - 28)));
        Company company2 = new Company("Bite", "Vilnius", new Gadget(LAPTOP, 3544, new Courier("LTPastas", "Vilnius", 2021 - 01 - 28)));
        Company company3 = new Company("Tele2", "Kaunas", new Gadget(TV, 1299, new Courier("Omniva", "Klaipeda", 2021 - 02 - 14)));

        List<Company> companies = new ArrayList<>();
        companies.add(company1);
        companies.add(company2);
        companies.add(company3);


        public Company getMostExpensiveGadgetCompany (Company[]companies){
            Company mostExpensiveGadgetCompany = companies[0];
            Company company;

            for (Company c : companies) {
                if (company.getMostExpensiveGadgetCompany() > companies[0]) {
                    company.getName() = mostExpensiveGadgetCompany.toString();
                }
            }
            return company;
        }

        System.out.println("Company, that has most expensive gadget is:  " + getMostExpensiveGadgetCompany);

    }
}




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
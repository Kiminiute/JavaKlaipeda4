package namu_Darbai.PollutionCountries;

public class PollutionMain {

    public static Country getLeastPollutedCountry(Country[] countries){
        Country leastPollutedCountry = countries[0];

        for (int i = 0; i < countries.length; i++){
            if(calculateCo2Emission(leastPollutedCountry) > calculateCo2Emission(countries[i])){
                leastPollutedCountry = countries [i];
            }
        }
        return leastPollutedCountry;
    }

    public static double getTotalEmissionsOfAllCountries(Country[] countries){
        double totalEmission = 0;
        for (int i = 0; i < countries.length; i ++){
            totalEmission += calculateCo2Emission(countries[i]);
        }
        return totalEmission;
    }

    public static double getAverageEmissionOfAllCountries(Country[] countries){
        double emmisionCounter = 0;
        for (int i = 0; i < countries.length; i++){
            emmisionCounter += calculateCo2Emission(countries[i]);
        }
        return emmisionCounter / countries.length;
    }

    public static double calculateCo2Emission(Country country){
        switch (country.getPollutionFactor()){
            case "Factories":
                return country.getCo2Emission() * 1.4;
            case "Transportation":
                return country.getCo2Emission() * 0.9;
            case "Animal husbandry":
                return country.getCo2Emission() * 1.2;
            default:
                return country.getCo2Emission();
        }
    }

    public static void main(String[] args) {

        Country[] countries;
        countries = new Country[9];
        countries[0] = new Country("Lithuania",502, "Transportation");
        countries[1] = new Country("Germany",4025, "Factories");
        countries[2] = new Country("Sweden",3552, "Transportation");
        countries[3] = new Country("Brazil",6787, "Animal husbandry");
        countries[4] = new Country("Colombia",6001, "Transportation");
        countries[5] = new Country("Argentina",172, "Factories");
        countries[6] = new Country("China",9857, "Animal husbandry");
        countries[7] = new Country("India",7561, "Factories");
        countries[8] = new Country("Russia",6714, "Transportation");


        System.out.println( "Least polluted country is " + getLeastPollutedCountry(countries).getName());
        System.out.println( "Total emission of all countries is " + getTotalEmissionsOfAllCountries(countries));
        System.out.println( "Average emission of all countries is " + getAverageEmissionOfAllCountries(countries));

    }

}

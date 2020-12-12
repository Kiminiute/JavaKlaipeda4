package advanced.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {
    public static void main(String[] args) {
        List<String> visitedCountries = new ArrayList<>();
        visitedCountries.add("Germany");
        visitedCountries.add("Spain");
        visitedCountries.add("France");
        visitedCountries.add("Germany");

        visitedCountries.remove("Spain");

        for (String country : visitedCountries){
            System.out.println(country);
        }
        Set<String> visited = new HashSet<>(visitedCountries);
        for (String country : visited){
            System.out.println(visitedCountries);

        }

    }
}

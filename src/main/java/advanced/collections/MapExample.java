package advanced.collections;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>();

        countries.put("Poland", "Warsaw");
        countries.put("Germany","Berlin");
        countries.put("Germany","W");

        List<String> coutryList = new ArrayList<>(countries.values());
        for (String mapValue : countries.values()){
            System.out.println(mapValue);
        }
        for (Map.Entry<String, String> country : countries.entrySet()){
            String countryKey = country.getKey();
            String capital = country.getValue();

            System.out.println(countries.get(countryKey) + "=" + capital);

        }


    }
}

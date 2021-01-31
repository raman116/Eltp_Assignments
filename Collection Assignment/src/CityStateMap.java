import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CityStateMap {
    public static void main(String[] args) throws IOException {
        Map<String, String> cityStateMap = new HashMap();
        FileReader file =  new FileReader("E:\\Persistent\\Collection Assignment\\CityState'.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext())
        {
            String line = scanner.nextLine();
            String[] city = line.split("-");
           // System.out.println(city[0] + " " + city[1]);
            cityStateMap.put(city[0],city[1]);
        }
        System.out.println("All cities");
        for (String city:cityStateMap.keySet())                                      // get all cities
        {
            System.out.println(city);
        }
        System.out.println("All states");
        for(String city : cityStateMap.keySet() )
        {
            System.out.println(cityStateMap.get(city));                             // get all states
        }
        System.out.println("City for state");
        for (Map.Entry<String, String> cityState:cityStateMap.entrySet()) {
            if(cityState.getValue().equalsIgnoreCase("Maharastra"))             // get city for state
            {
                System.out.println(cityState.getKey());
            }
        }
        System.out.println("Adding new city state pair");
        cityStateMap.put("Nagpur","Maharastra") ;                         // add new city state pair

        System.out.println("deleting all cities for state");
        Iterator<Map.Entry<String, String>> iterator = cityStateMap.entrySet().iterator();
        while (iterator.hasNext())                                              // Remove all cities of a state
        {
            Map.Entry<String, String> value = iterator.next();
            if(value.getValue().equalsIgnoreCase("Maharastra"))
            {
                iterator.remove();
            }
        }
        System.out.println(cityStateMap);
    }
}

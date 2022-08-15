package HomeWork2;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        City city1 = new City(678, "Osh");
        City city2 = new City(985, "Batken");
        City city3 = new City(345, "Moscow");


        Set<City> citySet = new TreeSet<>();
        citySet.add(city1);
        citySet.add(city2);
        citySet.add(city3);

        for (City c : citySet) {
            if (c.getCode() % 2 != 0) {
                System.out.println(c);
            }
        }
    }
}

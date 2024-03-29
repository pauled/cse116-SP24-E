package week9;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;
public class TestCities {
    private void compareCities(City expected,City actual){
        assertEquals(expected.getCountry(),actual.getCountry());
        assertEquals(expected.getName(),actual.getName());
        assertEquals(expected.getPopulation(),actual.getPopulation());
        assertEquals(expected.getRegion(),actual.getRegion());
        assertEquals(expected.getLocation().getLatitude(),
                actual.getLocation().getLatitude(),.001);
        assertEquals(expected.getLocation().getLongitude(),
                actual.getLocation().getLongitude(),.001);
    }
    private void compareCountryHashMaps(HashMap<String, ArrayList<City>> expected,
                                        HashMap<String, ArrayList<City>> actual){
        assertEquals(expected.size(),actual.size());
        for (String country : expected.keySet()){
            assertTrue(actual.containsKey(country));
            ArrayList<City> expectedList=expected.get(country);
            ArrayList<City> actualList=actual.get(country);
            assertEquals(expectedList.size(),actualList.size());
            for (int x=0; x< expectedList.size(); x++){
                compareCities(expectedList.get(x),actualList.get(x));
            }
        }
    }
    @Test
    public void testSingleCity(){
        String filename="data/cities_test_1.csv";
        HashMap<String, ArrayList<City>> actual=
                CountriesExample.loadCountries(filename);
        HashMap<String, ArrayList<City>> expected=new HashMap<>();
        expected.put("us",new ArrayList<>(Arrays.asList(
                new City("buffalo","NY","us",279557,
                        new Location(42.8863889,-78.8786111))
        )));
        compareCountryHashMaps(expected,actual);
    }
    @Test
    public void testMultipleCity(){
        String filename="data/cities_test_2.csv";
        HashMap<String, ArrayList<City>> actual=
                CountriesExample.loadCountries(filename);
        HashMap<String, ArrayList<City>> expected=new HashMap<>();
        expected.put("gi",new ArrayList<>(Arrays.asList(
                new City("gibraltar","00","gi",26544,
                        new Location(36.13333333,-5.35))
        )));
        expected.put("ae",new ArrayList<>(Arrays.asList(
                new City("abu dhabi","01","ae",603687,
                        new Location(24.466667,54.366667)),
                new City("dubai","03","ae",1137376,
                        new Location(25.258172,55.304717)),
                new City("sharjah","06","ae",543942,
                        new Location(25.35731,55.403304))
        )));
        compareCountryHashMaps(expected,actual);
    }
}

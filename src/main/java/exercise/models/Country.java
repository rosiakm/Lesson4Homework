package exercise.models;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Country {
    private String countryName;
    private char countrySign;

    public Country() {
    }

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    public String getCountryName() {
        return countryName;
    }

    public char getCountrySign() {
        return countrySign;
    }

    public List<Country> createNewCountries() {
        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'D');
        Country france = new Country("France", 'F');
        Country unitedStates = new Country("United States", 'U');
        Country japan = new Country("Japan", 'J');
        return new ArrayList<>(asList(poland, germany, france, unitedStates, japan));
    }
}

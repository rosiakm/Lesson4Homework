package exercise.models;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Market {
    private String name;
    private List<Country> countries;
    private Country country;

    public Market() {
    }

    public Market(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public List<Market> createNewMarkets() {
        country = new Country();
        List<Market> allMarkets = new ArrayList<>();
        allMarkets.add(new Market("business", new ArrayList<>(asList(country.createNewCountries().get(2),
                country.createNewCountries().get(3),
                country.createNewCountries().get(4)))));
        allMarkets.add(new Market("cargo", new ArrayList<>(asList(country.createNewCountries().get(0),
                country.createNewCountries().get(1),
                country.createNewCountries().get(2)))));
        allMarkets.add(new Market("transport", new ArrayList<>(asList(country.createNewCountries().get(4),
                country.createNewCountries().get(0),
                country.createNewCountries().get(3)))));
        allMarkets.add(new Market("taxi", new ArrayList<>(asList(country.createNewCountries().get(1),
                country.createNewCountries().get(2),
                country.createNewCountries().get(4)))));
        allMarkets.add(new Market("bus", new ArrayList<>(asList(country.createNewCountries().get(1),
                country.createNewCountries().get(3),
                country.createNewCountries().get(4)))));
        return allMarkets;
    }

    public void printCountry(Country country) {
        this.country = country;
        System.out.println(country.getCountryName() + " - " + country.getCountrySign());
    }
}

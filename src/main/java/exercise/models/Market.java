package exercise.models;
import java.util.List;

public class Market {
    private String name;
    private List<Country> countries;

    private Country country;

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

    public void printCountry(Country country){
        this.country = country;
        System.out.println(country.getCountryName() + " - " + country.getCountrySign());
    }
}

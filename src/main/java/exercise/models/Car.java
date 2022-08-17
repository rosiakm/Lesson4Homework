package exercise.models;

import exercise.dataFactory.DataFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Car {
    private Producer producer;
    private boolean isAutomaticGear;
    private Market market;
    private Dimension dimension;

    public Car() {
    }

    public Car(Producer producer, boolean isAutomaticGear, Market market, String segment, Dimension dimension) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.dimension = dimension;
    }

    public void printMarketCountries() {
        DataFactory dataFactory = new DataFactory();
        for (Car myCar : dataFactory.createListOfCars()) {
            if (myCar.producer.getModel().equals("BMW") && myCar.isAutomaticGear && myCar.dimension.getTankCapacity() > 300) {
                for (int i = 0; i < 3; i++) {
                    Country marketCountry = myCar.market.getCountries().get(i);
                    System.out.println("Country from the market: " + myCar.market.getName());
                    myCar.market.printCountry(marketCountry);
                }
            }
        }
    }

    public static String returnSegment() {
        List<String> segmentTypes = new ArrayList<>(asList("standard", "medium", "premium"));
        Random random = new Random();
        return segmentTypes.get(random.nextInt(segmentTypes.size()));
    }

}

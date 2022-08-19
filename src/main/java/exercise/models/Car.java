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

    public void printMarketCountries(String model, boolean isAutomaticGear, int tankCapacity) {
        this.isAutomaticGear = isAutomaticGear;

        DataFactory dataFactory = new DataFactory();
        for (Car myCar : dataFactory.createListOfCars()) {
            if (myCar.producer.getModel().equals(model) && myCar.isAutomaticGear && myCar.dimension.getTankCapacity() > tankCapacity) {
                for (int i = 0; i < 3; i++) {
                    Country marketCountry = myCar.market.getCountries().get(i);
                    myCar.market.printCountry(marketCountry);
                }
            }
        }
    }

    public String returnSegment() {
        List<String> segmentTypes = new ArrayList<>(asList("standard", "medium", "premium"));
        Random random = new Random();
        return segmentTypes.get(random.nextInt(segmentTypes.size()));
    }

}

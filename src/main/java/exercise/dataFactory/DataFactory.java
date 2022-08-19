package exercise.dataFactory;

import exercise.models.Car;
import exercise.models.Dimension;
import exercise.models.Market;
import exercise.models.Producer;

import java.util.ArrayList;
import java.util.List;

public class DataFactory {
    private DataFactory dataFactory;

    public DataFactory() {
    }

    public DataFactory(DataFactory dataFactory) {
        this.dataFactory = dataFactory;
    }

    public DataFactory getDataFactory() {
        return dataFactory;
    }

    public void setDataFactory(DataFactory dataFactory) {
        this.dataFactory = dataFactory;
    }

    public List<Car> createListOfCars() {
        Car car = new Car();
        Producer producer = new Producer();
        Market market = new Market();
        Dimension dimension = new Dimension();
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car(producer.createListOfProducers().get(0), true, market.createNewMarkets().get(0),
                car.returnSegment(), dimension.createListOfDimensions().get(0)));
        allCars.add(new Car(producer.createListOfProducers().get(1), true, market.createNewMarkets().get(1),
                car.returnSegment(), dimension.createListOfDimensions().get(1)));
        allCars.add(new Car(producer.createListOfProducers().get(2), false, market.createNewMarkets().get(2),
                car.returnSegment(), dimension.createListOfDimensions().get(2)));
        allCars.add(new Car(producer.createListOfProducers().get(3), false, market.createNewMarkets().get(3),
                car.returnSegment(), dimension.createListOfDimensions().get(3)));
        allCars.add(new Car(producer.createListOfProducers().get(4), false, market.createNewMarkets().get(4),
                car.returnSegment(), dimension.createListOfDimensions().get(4)));
        allCars.add(new Car(producer.createListOfProducers().get(5), true, market.createNewMarkets().get(0),
                car.returnSegment(), dimension.createListOfDimensions().get(5)));
        allCars.add(new Car(producer.createListOfProducers().get(6), false, market.createNewMarkets().get(1),
                car.returnSegment(), dimension.createListOfDimensions().get(6)));
        allCars.add(new Car(producer.createListOfProducers().get(7), false, market.createNewMarkets().get(2),
                car.returnSegment(), dimension.createListOfDimensions().get(7)));
        allCars.add(new Car(producer.createListOfProducers().get(8), true, market.createNewMarkets().get(3),
                car.returnSegment(), dimension.createListOfDimensions().get(8)));
        allCars.add(new Car(producer.createListOfProducers().get(9), false, market.createNewMarkets().get(4),
                car.returnSegment(), dimension.createListOfDimensions().get(9)));
        allCars.add(new Car(producer.createListOfProducers().get(0), false, market.createNewMarkets().get(0),
                car.returnSegment(), dimension.createListOfDimensions().get(0)));
        allCars.add(new Car(producer.createListOfProducers().get(1), true, market.createNewMarkets().get(0),
                car.returnSegment(), dimension.createListOfDimensions().get(1)));
        allCars.add(new Car(producer.createListOfProducers().get(2), true, market.createNewMarkets().get(2),
                car.returnSegment(), dimension.createListOfDimensions().get(2)));
        allCars.add(new Car(producer.createListOfProducers().get(3), false, market.createNewMarkets().get(3),
                car.returnSegment(), dimension.createListOfDimensions().get(3)));
        allCars.add(new Car(producer.createListOfProducers().get(4), false, market.createNewMarkets().get(4),
                car.returnSegment(), dimension.createListOfDimensions().get(4)));
        return allCars;
    }
}

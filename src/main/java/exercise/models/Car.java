package exercise.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Car {
    private Producer producer;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    private Dimension dimension;

    public Car(Producer producer, boolean isAutomaticGear, Market market, String segment, Dimension dimension){
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimension = dimension;
    }

    public static void main(String[] args) {
        //new countries
        Country poland = new Country("Poland",'P');
        Country germany = new Country("Germany", 'D');
        Country france = new Country("France", 'F');
        Country unitedStates = new Country("United States", 'U');
        Country japan = new Country("Japan", 'J');

        //new markets
        List<Market> allMarkets = new ArrayList<>();
        allMarkets.add(new Market("business",new ArrayList<>(asList(unitedStates,japan,germany))));
        allMarkets.add(new Market("cargo", new ArrayList<>(asList(poland,france,unitedStates))));
        allMarkets.add(new Market("transport", new ArrayList<>(asList(poland,unitedStates,germany))));
        allMarkets.add(new Market("taxi", new ArrayList<>(asList(japan,france,germany))));
        allMarkets.add(new Market("bus", new ArrayList<>(asList(germany,france,japan))));

        //new dimensions
        List<Dimension> allDimensions = new ArrayList<>();
        allDimensions.add(new Dimension(75,145,240));
        allDimensions.add(new Dimension(90,160,302));
        allDimensions.add(new Dimension(90,150,300));
        allDimensions.add(new Dimension(62,120,220));
        allDimensions.add(new Dimension(70,140,252));
        allDimensions.add(new Dimension(100,180,320));
        allDimensions.add(new Dimension(95,155,305));
        allDimensions.add(new Dimension(80,175,288));
        allDimensions.add(new Dimension(88,172,305));
        allDimensions.add(new Dimension(75,145,240));

        //new producers
        List<Producer> allProducers = new ArrayList<>();
        allProducers.add(new Producer("Toyota","Corolla"));
        allProducers.add(new Producer("BMW","X5"));
        allProducers.add(new Producer("BMW","i4"));
        allProducers.add(new Producer("Toyota","Avensis"));
        allProducers.add(new Producer("Renault","Kadjar"));
        allProducers.add(new Producer("Peugeot","3008"));
        allProducers.add(new Producer("Mazda","CX5"));
        allProducers.add(new Producer("Mazda","CX3"));
        allProducers.add(new Producer("Jaguar","F-PACE"));
        allProducers.add(new Producer("Hyundai","Tucson"));

        //new Cars
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car(allProducers.get(0),true,allMarkets.get(0),returnSegment(),allDimensions.get(0)));
        allCars.add(new Car(allProducers.get(1),true,allMarkets.get(1),returnSegment(),allDimensions.get(1)));
        allCars.add(new Car(allProducers.get(2),false,allMarkets.get(2),returnSegment(),allDimensions.get(2)));
        allCars.add(new Car(allProducers.get(3),false,allMarkets.get(3),returnSegment(),allDimensions.get(3)));
        allCars.add(new Car(allProducers.get(4),false,allMarkets.get(4),returnSegment(),allDimensions.get(4)));
        allCars.add(new Car(allProducers.get(5),true,allMarkets.get(0),returnSegment(),allDimensions.get(5)));
        allCars.add(new Car(allProducers.get(6),false,allMarkets.get(1),returnSegment(),allDimensions.get(6)));
        allCars.add(new Car(allProducers.get(7),false,allMarkets.get(2),returnSegment(),allDimensions.get(7)));
        allCars.add(new Car(allProducers.get(8),true,allMarkets.get(3),returnSegment(),allDimensions.get(8)));
        allCars.add(new Car(allProducers.get(9),false,allMarkets.get(4),returnSegment(),allDimensions.get(9)));
        allCars.add(new Car(allProducers.get(0),false,allMarkets.get(0),returnSegment(),allDimensions.get(0)));
        allCars.add(new Car(allProducers.get(1),true,allMarkets.get(0),returnSegment(),allDimensions.get(1)));
        allCars.add(new Car(allProducers.get(2),true,allMarkets.get(2),returnSegment(),allDimensions.get(2)));
        allCars.add(new Car(allProducers.get(3),false,allMarkets.get(3),returnSegment(),allDimensions.get(3)));
        allCars.add(new Car(allProducers.get(4),false,allMarkets.get(4),returnSegment(),allDimensions.get(4)));

        for (Car myCar:allCars) {
            if(myCar.producer.getModel().equals("BMW") && myCar.isAutomaticGear == true && myCar.dimension.getTankCapacity() > 300){
                for (int i = 0; i < 3; i++){
                    Country marketCountry = myCar.market.getCountries().get(i);
                    System.out.println("Country from the market: " + myCar.market.getName());
                    myCar.market.printCountry(marketCountry);
                }
            }
        }
    }
    public static String returnSegment(){
        List<String> segmentTypes = new ArrayList<>(asList("standard", "medium", "premium"));
        Random random = new Random();
        String randomSegment = segmentTypes.get(random.nextInt(segmentTypes.size()));
        return randomSegment;
    }

}

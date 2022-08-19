package exercise.runner;

import exercise.dataFactory.DataFactory;
import exercise.models.Car;

public class Main {
    public static void main(String[] args) {
        DataFactory dataFactory = new DataFactory();
        Car car = new Car();

        dataFactory.createListOfCars();
        car.printMarketCountries("BMW",true,300);
    }
}

package exercise.models;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private String model;
    private String type;

    public Producer() {
    }

    public Producer(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public List<Producer> createListOfProducers() {
        List<Producer> allProducers = new ArrayList<>();
        allProducers.add(new Producer("Toyota", "Corolla"));
        allProducers.add(new Producer("BMW", "X5"));
        allProducers.add(new Producer("BMW", "i4"));
        allProducers.add(new Producer("Toyota", "Avensis"));
        allProducers.add(new Producer("Renault", "Kadjar"));
        allProducers.add(new Producer("Peugeot", "3008"));
        allProducers.add(new Producer("Mazda", "CX5"));
        allProducers.add(new Producer("Mazda", "CX3"));
        allProducers.add(new Producer("Jaguar", "F-PACE"));
        allProducers.add(new Producer("Hyundai", "Tucson"));
        return allProducers;
    }
}

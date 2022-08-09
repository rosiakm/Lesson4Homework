package exercise.models;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private String model;
    private String type;

    public Producer(String model, String type){
        this.model = model;
        this.type = type;
    }

    public String getModel(){
        return model;
    }

    public String getType(){
        return type;
    }
}

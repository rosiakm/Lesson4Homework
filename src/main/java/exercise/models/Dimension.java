package exercise.models;

import java.util.ArrayList;
import java.util.List;

public class Dimension {
    private int high;
    private int width;
    private int tankCapacity;

    public Dimension() {
    }

    public Dimension(int high, int width, int tankCapacity) {
        this.high = high;
        this.width = width;
        this.tankCapacity = tankCapacity;
    }

    public int getHigh() {
        return high;
    }

    public int getWidth() {
        return width;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public List<Dimension> createListOfDimensions() {
        List<Dimension> allDimensions = new ArrayList<>();
        allDimensions.add(new Dimension(75, 145, 240));
        allDimensions.add(new Dimension(90, 160, 302));
        allDimensions.add(new Dimension(90, 150, 300));
        allDimensions.add(new Dimension(62, 120, 220));
        allDimensions.add(new Dimension(70, 140, 252));
        allDimensions.add(new Dimension(100, 180, 320));
        allDimensions.add(new Dimension(95, 155, 305));
        allDimensions.add(new Dimension(80, 175, 288));
        allDimensions.add(new Dimension(88, 172, 305));
        allDimensions.add(new Dimension(75, 145, 240));
        return allDimensions;
    }
}

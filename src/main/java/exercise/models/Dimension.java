package exercise.models;

public class Dimension {
    private int high;
    private int width;
    private int tankCapacity;

    public Dimension(int high, int width, int tankCapacity){
        this.high = high;
        this.width = width;
        this.tankCapacity = tankCapacity;
    }

    public int getHigh(){
        return high;
    }
    public int getWidth() {
        return width;
    }
    public int getTankCapacity(){
        return tankCapacity;
    }
}

package lesson01.homework;

public class Road {

    private int roadLength;

    public Road(int roadLength) {
        this.roadLength = roadLength;
    }

    public int getRoadLength() {
        return roadLength;
    }

    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }

    public boolean check(CanRun competitor) {
        return competitor.run(this.roadLength);
    }

}



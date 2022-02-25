package core;

public class TrainStation {
    private String name;
    private int track;
    private int departureTime;

    public TrainStation(String name, int track, int departureTime) {
        this.name = name;
        this.track = track;
        this.departureTime = departureTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return  name + ", am Gleis: " + track + ", um " + departureTime + " Uhr";
    }
}

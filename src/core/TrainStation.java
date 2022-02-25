package core;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainStation station = (TrainStation) o;
        return track == station.track && departureTime == station.departureTime && Objects.equals(name, station.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, track, departureTime);
    }

    @Override
    public String toString() {
        return  name + ", am Gleis: " + track + ", um " + departureTime + " Uhr";
    }
}

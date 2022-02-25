package core;

import java.util.ArrayList;
import java.util.Objects;

public class Train {
    private String name;
    private ArrayList<TrainStation> station;

    public Train(String name) {
        this.name = name;
        this.station = new ArrayList<>();
    }

    public void addStation(TrainStation ts){
        station.add(ts);
    }

    public void removeStation(TrainStation ts){
         station.remove(ts);
    }

    public ArrayList<TrainStation> getStation() {
        return station;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Objects.equals(name, train.name) && Objects.equals(station, train.station);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, station);
    }

    @Override
    public String toString() {
        return "Zugnummer: " + name + ", Ankunft in " + station;
    }
}

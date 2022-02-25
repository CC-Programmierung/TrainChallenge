package core;

import java.util.ArrayList;

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
    public String toString() {
        return "Zugnummer: " + name + ", Ankunft in " + station;
    }
}

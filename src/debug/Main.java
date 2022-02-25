package debug;

import core.Train;
import core.TrainStation;

public class Main {

    public static void main(String[] args) {
        TrainStation station = new TrainStation("Wuppertal",4,12);
        TrainStation station2 = new TrainStation("Düsseldorf",8,15);
	    Train test = new Train("S7");

        test.addStation(station);
        test.addStation(station2);
        System.out.println(test);
        test.removeStation(station);
        System.out.println(test);

    }
}

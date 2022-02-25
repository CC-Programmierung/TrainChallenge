package debug;

import core.Train;
import core.TrainStation;
import sorter.SortByTime;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        TrainStation station = new TrainStation("Wuppertal",4,12);
        TrainStation station2 = new TrainStation("Düsseldorf",8,15);
	    Train train = new Train("S7");
        Train train1= new Train("S8");

        train.addStation(station);
        train.addStation(station2);
        System.out.println(train);
        train.removeStation(station);
        System.out.println(train);
        train1.addStation(station);
        System.out.println(train1);

        // Das in Fahrplan klasse ?
        LinkedList list = new LinkedList<>();
        list.add(station2);
        list.add(station);


        Collections.sort(list,new SortByTime());
        for(Object time : list){
            System.out.println(time);
        }


    }
}

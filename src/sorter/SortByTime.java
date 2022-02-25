package sorter;

import core.Train;
import core.TrainStation;

import java.util.Comparator;

public class SortByTime implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(((TrainStation)o1).getDepartureTime() > ((TrainStation)o2).getDepartureTime()){
            return  1;
        }else if(((TrainStation)o1).getDepartureTime() < ((TrainStation)o2).getDepartureTime()){
            return -1;
        }else{
            return 0;
        }
    }
}
package ua.lviv.lgs;

import java.util.Comparator;

public class SortByName implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if(o1.getName().compareTo(o2.getName())>0){
            return 1;
        }else if (o1.getName().compareTo(o2.getName())<0){
            return -1;
        }
        return 0;
    }
}

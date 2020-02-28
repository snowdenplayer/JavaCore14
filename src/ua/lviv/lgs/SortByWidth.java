package ua.lviv.lgs;

import java.util.Comparator;

public class SortByWidth implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if(o1.getWidth()>o2.getWidth()){
            return 1;
        }else if(o1.getWidth()<o2.getWidth()){
            return -1;
        }
        return 0;
    }
}

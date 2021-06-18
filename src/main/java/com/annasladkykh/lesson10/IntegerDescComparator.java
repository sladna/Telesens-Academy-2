package com.annasladkykh.lesson10;

import java.util.Comparator;

public class IntegerDescComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1;

        if (o1 > o2)
            return -1;

        return 0;
    }
}
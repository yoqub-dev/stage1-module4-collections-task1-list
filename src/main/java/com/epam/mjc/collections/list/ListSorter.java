package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aValue = evaluateFunction(a);
        int bValue = evaluateFunction(b);

        if (aValue != bValue) {
            return Integer.compare(aValue, bValue);
        } else {
            return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
        }
    }

    private int evaluateFunction(String str) {
        int x = Integer.parseInt(str);
        return 5 * x * x + 3;
    }
}

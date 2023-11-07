package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= sourceList.size() ; i++) {
            if (i % 3 == 0){
                String word = sourceList.get(i - 1);
                result.add(word);
                result.add(word);
            }
        }

        return result;
    }
}

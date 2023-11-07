package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {

        LinkedList<Integer> integers = new LinkedList<>();

        for (int i = 1; i <= sourceList.size(); i++) {
           if (i % 2 != 0){
               integers.addFirst(i);
           }else {
               integers.addLast(i);
           }
        }

        return integers;
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(2);
        integers.add(14);
        integers.add(3);
        integers.add(6);
        integers.add(5);
        integers.add(7);

        System.out.println(creator.createLinkedList(integers));
    }
}

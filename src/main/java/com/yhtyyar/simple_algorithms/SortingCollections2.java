package main.java.com.yhtyyar.simple_algorithms;

import java.util.*;

public class SortingCollections2 {


    public static void main(String[] args) {


        sortingCollections();
    }

    private static void sortingCollections() {

        SortedMap <Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(6, 3);
        treeMap.put(4, 8);
        treeMap.put(5, 76544);
        treeMap.put(8, -42);
        treeMap.put(1, -100);
        treeMap.put(200, 26);
        treeMap.put(26, 4);
        treeMap.put(3, 5);
        treeMap.put(-100, 1);
        treeMap.put(100, 6);


        TreeSet<Integer> treeSet = new TreeSet<Integer>(treeMap.values());

        for (Map.Entry i : treeMap.entrySet() ){
            if (treeSet.tailSet(1).contains(i.getKey())) {
                System.out.print(i.getKey() + " ");
            } else {
                System.out.print("");
            }
        }
    }

}
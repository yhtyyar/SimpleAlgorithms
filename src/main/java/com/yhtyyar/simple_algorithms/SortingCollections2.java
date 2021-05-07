package main.java.com.yhtyyar.simple_algorithms;

import java.util.*;

public class SortingCollections2 {

    static int [] key = {6,4,5,8,1,200,26,3,-100,100};
    static int [] value = {3,8,76544,-42,-100,26,4,5,1,6,};

    public static void main(String[] args) {


        sortingCollections(key,value);

    }

    private static void sortingCollections(int [] key, int [] value) {

        Map <Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < key.length; i++) {
            hashMap.put(key[i], value[i]);
        }

        TreeSet <Integer> treeSet = new TreeSet<>(hashMap.values());

        LinkedList linkedList = new LinkedList();

        for (Map.Entry i : hashMap.entrySet() ){
            if (treeSet.tailSet(1).contains(i.getKey())) {
                linkedList.add(i.getKey());
            }
        }
        System.out.println(linkedList);
    }

}
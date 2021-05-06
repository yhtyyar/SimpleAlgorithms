package main.java.com.yhtyyar.simple_algorithms;

import java.util.*;

public class SortingCollections2 {


    public static void main(String[] args) {


        sortingCollections();

    }

    private static void sortingCollections() {

        HashMap <Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(6, 3);
        hashMap.put(4, 8);
        hashMap.put(5, 76544);
        hashMap.put(8, -42);
        hashMap.put(1, -100);
        hashMap.put(200, 26);
        hashMap.put(26, 4);
        hashMap.put(3, 5);
        hashMap.put(-100, 1);
        hashMap.put(100, 6);


        TreeSet <Integer> treeSet = new TreeSet<>(hashMap.values());

        LinkedList linkedList = new LinkedList();

        for (Map.Entry i : hashMap.entrySet() ){
            if (treeSet.tailSet(1).contains(i.getKey())) {
                linkedList.add(i.getKey());
            } else {
                System.out.print("");
            }
        }
        System.out.println(linkedList);
    }

}
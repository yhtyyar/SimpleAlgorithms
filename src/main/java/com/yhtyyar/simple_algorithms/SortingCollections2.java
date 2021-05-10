package main.java.com.yhtyyar.simple_algorithms;

import java.util.*;

public class SortingCollections2 {

    public static void main(String[] args) {

        List<Integer> first = new ArrayList<>(Arrays.asList(6,4,5,8,1,200,26,3,-100,100));

        List<Integer> second = new ArrayList<>(Arrays.asList(3,8,76544,-42,-100,26,4,5,1,6));


        sortingCollections(first, second);

    }


    private static List<Integer> sortingCollections(List<Integer> firstCollection,
                                                    List<Integer> secondCollection) {


        TreeSet <Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < firstCollection.size(); i++) {
            if(secondCollection.contains(firstCollection.get(i))){
                    treeSet.add(firstCollection.get(i));
            }
        }

        List <Integer> result =  new ArrayList<>(treeSet);


        return   result;
    }

}
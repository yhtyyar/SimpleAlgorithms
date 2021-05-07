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


        Map <Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < firstCollection.size(); i++) {
            hashMap.put(firstCollection.get(i), secondCollection.get(i));
        }

        TreeSet <Integer> treeSet = new TreeSet<>();

        List <Integer> result =  new ArrayList<>(treeSet);


        for (int i = 0; i < firstCollection.size(); i++) {
            if(secondCollection.contains(firstCollection.get(i))){
                if ( firstCollection.get(i) > 0) {
                    result.add(firstCollection.get(i));

                }
            }
        }

        return   result;
    }

}
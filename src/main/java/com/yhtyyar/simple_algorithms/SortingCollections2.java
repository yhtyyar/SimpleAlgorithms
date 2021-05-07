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





//        Integer [] first = new Integer [firstCollection.size()];
//        first = firstCollection.toArray(first);
//
//
//        Map<Integer,Integer> hashMap = new HashMap<>();
//
//        for (int i = 0; i < first.length; i++) {
//            hashMap.put(first[i],second[i]);
//        }
//
//        TreeSet <Integer> treeSet = new TreeSet <>(hashMap.values());
//
//
//
//        for (Map.Entry i : hashMap.entrySet() ){
//            if (treeSet.tailSet(0).contains(i.getKey())) {
//
//
//            }
//        }





//    private static void sortingCollections1(int [] key, int [] value) {
//
//        Map <Integer, Integer> hashMap = new HashMap<>();
//
//        for (int i = 0; i < key.length; i++) {
//            hashMap.put(key[i], value[i]);
//        }
//
//        TreeSet <Integer> treeSet = new TreeSet<>(hashMap.values());
//
//        LinkedList linkedList = new LinkedList();
//
//        for (Map.Entry i : hashMap.entrySet() ){
//            if (treeSet.tailSet(1).contains(i.getKey())) {
//                linkedList.add(i.getKey());
//                treeSet = new TreeSet <Integer>((Collection<? extends Integer>) i.getKey());
//            }
//        }
//        System.out.println(treeSet);
//    }

}
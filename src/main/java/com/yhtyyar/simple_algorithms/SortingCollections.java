package main.java.com.yhtyyar.simple_algorithms;

import com.sun.corba.se.spi.activation.BadServerDefinition;

import java.util.*;

public class SortingCollections {


    static int firstCollection [] = new int[] {6,4,6,8,1,100,-100};
    static int secondCollection [] = new int[] {3,8,76544, -42, 100,1,9};

    public static void main(String [] args) {

        sortingCollections();


    }

    private static void sortingCollections (){

        for (int i = 0; i < firstCollection.length; i++) {
            if (firstCollection[i] > 0) {
                int first = firstCollection[i];
                Arrays.sort(firstCollection);   //сортировка массива

                for (int j = 0; j < secondCollection.length; j++) {
                    if (secondCollection[j] > 0) {
                        int second = secondCollection[j];

                        if (first == second) {
                            System.out.print(first + " ");
                        } else {
                            System.out.print("");
                        }

                    } else if (secondCollection[j] <= 0) {
                        System.out.print("");
                    }
                }

            } else if (firstCollection[i] <= 0) {
                System.out.print("");
            } ;
        }

    }
}

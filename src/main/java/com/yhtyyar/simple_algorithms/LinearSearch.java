package main.java.com.yhtyyar.simple_algorithms;

public class LinearSearch {

    public static void main(String args[]) {

        int[] integerArray = {80, 45, 77, 40, 12, -183, 34, 165, 100, 66};
        int elementToFind = 34;

        System.out.println("Element " + elementToFind + " found, index: " + linerSearch(integerArray, elementToFind));
    }

    public static int linerSearch(int[] integerArray, int key) {

        int arraySize = integerArray.length;
        for (int i = 0; i < arraySize; i++) {
            if (integerArray[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

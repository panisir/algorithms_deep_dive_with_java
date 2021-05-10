package com.melo.arraysandbigonotation;

public class ArraysAndBigONotation {

    /**
     * Time Complexity
     *      - Number of steps involved to run algorithm
     *      - We will deep dive more here
     *      - We always look at the worse time complexity because best case does not help us
     * Memory Complexity
     *      - Amount of memory it takes to run algorithm
     *      - These days is not a issue
     * **/

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;


        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }

}

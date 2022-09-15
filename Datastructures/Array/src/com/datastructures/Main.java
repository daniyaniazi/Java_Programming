package com.datastructures;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] numbers = new int[3];
        // return memory address refrecne
        //System.out.println((numbers));
        // all items initailized to 0
        System.out.println(Arrays.toString(numbers));
        // initialization
        numbers[0]=3;
        numbers[1]=2;
        numbers[2]=1;
        System.out.println(Arrays.toString(numbers));
        // 2nd way
        int [] arrayInit = {10,20,30};
        System.out.println(Arrays.toString(arrayInit));
        // get length
        System.out.println(numbers.length);

        //Problem : if you want to increase the leme nt in array you have to copy all the array in the new array of greater length and then add new item
        // use LinkedList

    }
}
package com.linkedlist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        System.out.println(list.size());
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(25);
        list.addLast(36);
        System.out.println(list.size());
        System.out.println(list.indexOf(200));
        list.removeFirst();
        list.removeLast();
        System.out.println(list.contains(10));
        System.out.println(list.size());
        int[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        list.reverse();
        array =list.toArray();
        System.out.println(Arrays.toString(array));


    }
}
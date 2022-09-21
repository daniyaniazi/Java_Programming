package com.linkedlist;

import java.util.LinkedList;

public class LinkedListJava {

    public  static  void  main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.contains(5);
        //list.indexOf(10);
        //list.size();

        System.out.println(list);
    }
}

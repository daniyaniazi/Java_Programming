package com.datastructures;

public class Program {
    public  static  void  main(String[] args){
        Array numbers = new Array(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
        numbers.insertAt(6,3);
//        numbers.removeAt(0);
//        numbers.print();
//        System.out.println((numbers.indexOf(100)));
//        System.out.println(numbers.max());
      //  numbers.reverse();
        numbers.print();
    }
}

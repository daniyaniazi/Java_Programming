package com.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node  {
//        no need of setters
        private  int value;
        private Node next;

        public  Node(int value){
            this.value=value;
        }
    }
    private int size;

    private Node first;
    private Node last;

    private boolean isEmpty(){
        return first == null;
    }

    // addFirst
    public  void    addFirst(int item){
        Node node = new Node(item);
                if(isEmpty()){
                  first=last=node;
                }else{
                    node.next= first;
                    first = node;
                }
                size++;
    }
    //addLast
    public  void  addLast(int item){
        Node node = new Node(item);

        if(isEmpty()){
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
        size++;
    }
    //deleteFirst
    public  void removeFirst(){
        if(isEmpty()) throw new NoSuchElementException();
        if(first==last){
            first = last = null;
        }
        else{
        Node second=first.next;
        first.next=null;
        first = second;
        }
        size--;
    }
    //deleteLast
    public void  removeLast(){
        if(isEmpty()) throw new NoSuchElementException();
        if(first==last){
            first = last = null;
        }else { Node prev = getPrevoius(last);
            last=prev;
            last.next=null;
        }
       size--;
    }
    private  Node getPrevoius(Node node){
        Node current = first;
        while (current!=null){
            if (current.next==node) return current;
            current = current.next;

        }
        return null;
    }
    //contains
    //indexOf
    public  int indexOf(int item){
        int index =0;
        Node current = first;
        while (current!=null){
            if(current.value==item)return  index;
                current=current.next;
                index=index+1;
        }
        return  -1;
    }
    public int[] toArray(){
        int[] array = new int[size];

        Node current= first;
        int index=0;
        while(current!=null){
            array[index++]=current.value;
            current=current.next;
        }
        return array;
    }
    public void  reverse(){
        if (isEmpty()) return;
        Node previous = first;
        Node current = first.next;
        while (current!=null){
            Node next=current.next;
            current.next=previous;
            previous =current;
            current=next;
        }
        last=first;
        last.next=null;
        first=previous;
    }
public int size(){
        return  size;

}
    public  boolean contains(int item){
        return  indexOf(item)!= -1;

    }

}

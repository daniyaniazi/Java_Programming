package com.datastructures;
public class Array {
    private int[] items;
    private  int count;
//    constructor
    public  Array(int length){
        items = new int[length];
    }
    public  void print(){
        for (int i=0;i<count;i++){
            System.out.println(items[i]);
        }
    }
    private void resizeIfRequired() {
        // if the array is full , resize it
        if(items.length==count){
            // create a new array (twice the size)
            int [] newItems = new int[count*2];
            //copy all the existing item
            for (int i=0;i<count;i++){
                newItems[i]=items[i];
            }
            // set item to this new array
            items= newItems;
        }
    }

    public  void insert(int item){
        resizeIfRequired();
        // Add new Item at the end of array
        items[count++]=item;
    }

    public void insertAt(int item, int index){
        if (index < 0 || index > count)
            throw new IllegalArgumentException();
        resizeIfRequired();

        //shifting the items from index to forward
        for (int i = count - 1; i >= index; i--)
            items[i + 1] = items[i];

        items[index] = item;
        count++;

    }
    public  void removeAt(int index){
//  Validate the index i,e -1
        if(index <0 || index >=count){
          throw  new IllegalArgumentException();
        }
        //shift items to the left
        for (int i=index ; i<count ; i++){
            items[i]=items[i+1];
        }
        count--;
    }
    public int indexOf(int item){
        for (int i=0 ; i<count ; i++){
            if(items[i]==item) return i;
        }
        return  -1;
    }

    public int max(){
        int max = items[0];
        for (int i=1 ; i<count ; i++){
            if(items[i]>max){
                max = items[i];
            }
        }
        return  max;
    }
    public Array intersect(Array other) {
        Array intersection = new Array(count);

        for (int item : items)
            if (other.indexOf(item) >= 0)
                intersection.insert(item);

        return intersection;
    }
    public void reverse(){
        int[] reverse = new int[count];

        for (int i=0 ; i<count; i++){
            reverse[i]=items[count-i-1];
        }
        items = reverse;
    }

}

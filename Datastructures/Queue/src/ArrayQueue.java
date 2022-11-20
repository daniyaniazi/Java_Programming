import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private  int front;
    private int rear;
    private  int count;
    public  ArrayQueue(int capacity){
        items = new int[capacity];
    }
    //enqueue
    public  void  enqueue(int item){
        if(count==items.length){
            throw new IllegalArgumentException();
        }
        items[rear++]=item;
        count++;
    }
    //dequeue
    public int dequeue(){
        int item = items[front];
        items[front++] = 0;
        count--;
        return item;
    }
    //peek
    //isEmpty
    //isFull
    //toString

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}

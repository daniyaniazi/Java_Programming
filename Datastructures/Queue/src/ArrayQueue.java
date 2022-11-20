import java.util.Arrays;
import java.util.NoSuchElementException;

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
        items[rear]=item;
        rear = (rear+1)%items.length;
        count++;
    }
    //dequeue
    public int dequeue(){
        if(count ==0){
            throw new NoSuchElementException();
        }
        int item = items[front];
        items[front] = 0;
        front = (front+1)%items.length;
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

import java.util.Arrays;

public class ArrayPriorityQueue {
    private int[] items;
    private int count;

    public ArrayPriorityQueue(int capacity) {

        items = new int[capacity];
    }

    public void enqueue(int item) {
        if(count == items.length){
            //todo : resize
            throw new IllegalStateException();
        }
//        shift items
        // [0,2,5,6,0] <-3
        // [0,2,5,5,6]
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item) {
                items[i + 1] = items[i];
            } else {
                break;
            }
            System.out.println("next");
        }
        items[i + 1] = item;
        count++;
    }
    public int dequeue(){
        if(isEmpty()){
            //todo : resize
            throw new IllegalStateException();
        }
        return items[--count];
    }
    public boolean isEmpty(){
      return  count==0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}

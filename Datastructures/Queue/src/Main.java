import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args)

    {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(30);queue.add(50);
        queue.add(60);
        System.out.println(queue);
        Integer front = queue.remove();
        System.out.println(front);
        System.out.println(queue);
        System.out.println(reverse(queue));

//        ArrayQueue
        ArrayQueue arrayQueue = new ArrayQueue(5);
        //  arrayQueue.dequeue();
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(30);
        arrayQueue.enqueue(50);
        arrayQueue.enqueue(60);
        System.out.println(arrayQueue);
        arrayQueue.dequeue();
        System.out.println(arrayQueue);
        arrayQueue.enqueue(70);
        arrayQueue.enqueue(80);
        System.out.println(arrayQueue);
        arrayQueue.dequeue();
        System.out.println(arrayQueue);
    }
    public  static  Queue  reverse (Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        return queue;
    }
}
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(30);
        stack.push(21);
        stack.push(11);
        System.out.println(stack);
        Integer top = stack.pop();
        System.out.println(top);
        System.out.println(stack);
        top = stack.peek();
        stack.push(top);
        System.out.println(top);
        System.out.println(stack);

        StackByArray arrayStack = new StackByArray();
        arrayStack.push(8);
        arrayStack.push(10);
        arrayStack.push(18);
        arrayStack.push(3);
        arrayStack.push(4);
        System.out.println(arrayStack.isFull());
        System.out.println(arrayStack);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack);
    }
}
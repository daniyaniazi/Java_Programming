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
    }
}
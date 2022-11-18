import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.StringReverse("Helloe"));
    }

    public static String StringReverse(String str){

        if(str == null){
            throw  new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();
        //        str.charAt(i)
        for (char ch: str.toCharArray()){
            stack.push(ch);
        }
        // concatenation is expensive becuase string is immutable and every time new obj is created in memory
        // String reverseStr = "";
        StringBuffer reversed = new StringBuffer();
        // string buffer is efficent to string manipulation
        while (!stack.empty()){
        reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
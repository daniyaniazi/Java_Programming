import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.ValidParanthesis("(Hello world!)"));
        System.out.println(Main.ValidParanthesis("(Hello (world!)"));

    }

    public  static  boolean ValidParanthesis(String input){
        Stack<Character> stack= new Stack<>();

        for (char ch : input.toCharArray()){
            if(ch == '(')
            {
                stack.push(ch);
            }
            if(ch == ')')
            {
                if (stack.empty()) return  false;
                stack.pop();
            }
        }
        return  stack.empty();
        }

}
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.ValidParanthesis("(Hello world!)"));
        System.out.println(Main.ValidParanthesis("(Hello (world!)"));
        System.out.println(Main.ValidParanthesis("[Hello (world!])"));

    }

    public  static  boolean ValidParanthesis(String input){
        Stack<Character> stack= new Stack<>();

        for (char ch : input.toCharArray()){
            if(ch == '(' || ch == '<' || ch=='[' || ch=='{')
            {
                stack.push(ch);
            }
            if(ch == ')'|| ch == '>' || ch==']' || ch=='}')
            {
                if (stack.empty()) return  false;
                Character top =stack.pop();

                if((ch == ')' && top !='(')
                || (ch == '>' && top !='<')
                || (ch == ']' && top !='[')
                || (ch == '}' && top !='{')){
                    return false;
                }
            }
        }
        return  stack.empty();
        }

}
import java.util.Stack;

public class ValidExpression {

    private  boolean isLeftBracket(Character ch){
       return ch == '(' || ch == '<' || ch=='[' || ch=='{' ;
    }
    private  boolean isRightBracket(Character ch){
        return ch == ')'|| ch == '>' || ch==']' || ch=='}';
    }

    private boolean bracketsMatch(char ch , char top){
        return (ch == ')' && top !='(')
                || (ch == '>' && top !='<')
                || (ch == ']' && top !='[')
                || (ch == '}' && top !='{');
    }
    public  boolean ValidParanthesis(String input){
        Stack<Character> stack= new Stack<>();

        for (char ch : input.toCharArray()){
            if(isLeftBracket(ch))
            {
                stack.push(ch);
            }
            if(isRightBracket(ch))
            {
                if (stack.empty()) return  false;
                Character top =stack.pop();

                if(bracketsMatch(ch,top)){
                    return false;
                }
            }
        }
        return  stack.empty();
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidExpression {

    private final List leftBrackets = Arrays.asList('(' ,'<' ,'[','{' );
    private final List rightBrackets = Arrays.asList(')' ,'>' ,']','}' );

    private  boolean isLeftBracket(Character ch){
        return leftBrackets.contains(ch) ;
    }
    private  boolean isRightBracket(Character ch){
        return rightBrackets.contains(ch) ;
    }

    private boolean bracketsMatch(char ch , char top){
    return   leftBrackets.indexOf(top) == rightBrackets.indexOf(ch);
//        return (ch == ')' && top !='(')
//                || (ch == '>' && top !='<')
//                || (ch == ']' && top !='[')
//                || (ch == '}' && top !='{');
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

                if(!bracketsMatch(ch,top)){
                    return false;
                }
            }
        }
        return  stack.empty();
    }
}

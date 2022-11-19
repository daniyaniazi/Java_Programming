import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ValidExpression exp = new ValidExpression();
        System.out.println(exp.ValidParanthesis("(Hello world!)"));
        System.out.println(exp.ValidParanthesis("(Hello (world!)"));
        System.out.println(exp.ValidParanthesis("[Hello (world!])"));

    }



}
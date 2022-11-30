import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        System.out.println(removeDuplicates("Hello world!"));
    }
    public  static  String removeDuplicates(String str){
        if (str==null) return "";
        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (Character ch: str.toCharArray()){
            if (!seen.contains(ch)){
                seen.add(ch);
                output.append(ch);
            }
        }
        return output.toString();
}
}
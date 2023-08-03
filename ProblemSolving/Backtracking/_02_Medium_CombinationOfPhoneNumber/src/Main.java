import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    List<String> ans= new ArrayList<>();
    HashMap<Character,String> map= new HashMap<>();
    public List<String> letterCombinations(String digits) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        if (digits != null && !digits.isEmpty()) {
            solve(0, digits, "");
        }
        return ans;
    }
    
    public void solve(int index,String digits,String temp){
        if (index >= digits.length()) {
            ans.add(temp);
            return;
        }
        char ch = digits.charAt(index);
        String alp = map.get(ch);
        
        for(int i=0;i<alp.length();i++){
            String newTemp =  temp + alp.charAt(i);
            solve(index+1,digits,newTemp);
            newTemp.substring(0, newTemp.length() - 1);
        }
    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp= new ArrayList<>();
        backTrack(1,n,k,temp);
        return result;
    }
    
    public void backTrack(int start,int end,int k,List<Integer> temp){
        if(k==0){
            // K elements have been taken
            result.add(new ArrayList<>(temp));
            return;
        }
        
        if(start>end){
            return;
        }
        
        temp.add(start);
        backTrack(start+1,end,k-1,temp);
        temp.remove(temp.size() - 1);
        backTrack(start+1,end,k,temp);
    }
}
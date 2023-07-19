import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        
        int max = Integer.MIN_VALUE;
        List<Integer> leader = new ArrayList<>();
        for (int i=a.length-1;i>=0; i--){
            if(a[i] > max){
                leader.add(a[i]);
                max=a[i];
            }
        }
        
        Collections.sort(leader);
        return leader;
    }
}
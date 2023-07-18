import java.util.ArrayList;
import java.util.List;

class Solution {
    // https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
    public int[] rearrangeArray(int[] nums) {
        int[] arr= new int[nums.length];
        int posInd=0;
        int negInd=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                arr[negInd]= nums[i];
                negInd+=2;
            }
            else{
                arr[posInd]= nums[i];
                posInd+=2;
            }
            
        }
        return arr;
    }
}

//https://www.codingninjas.com/studio/problems/alternate-numbers_6783445
class SolutionNotEqualOccurences {
    
    public static int[] alternateNumbers(int[] a) {
        // Write your code here.
        List<Integer> pos = new ArrayList();
        List<Integer> neg = new ArrayList();
        // SC : O(N)
        
        for (int i : a) {
            if (i < 0) {
                neg.add(i);
            } else {
                pos.add(i);
            }
        }
        
        // TC : O(2N)
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                a[2 * i] = pos.get(i);
                a[(2 * i) + 1] = neg.get(i);
            }
            
            int rem = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                a[rem] = pos.get(i);
                rem++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                a[2 * i] = pos.get(i);
                a[(2 * i) + 1] = neg.get(i);
            }
            
            int rem = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                a[rem] = neg.get(i);
                rem++;
            }
            
        }
        
        return a;
    }
}
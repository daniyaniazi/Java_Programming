public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public boolean check(int[] nums) {
        int oneGreaterMatchFound = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                // this condition also cover check to be false nums[n] > nums[0]
                oneGreaterMatchFound++;
                if(oneGreaterMatchFound>1){
                    return false;
                }
            }
        }
        
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOcc = 0;
        int currentOcc = 0 ;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                currentOcc = 0;
            }
            else{
                currentOcc++;
                if(currentOcc>maxOcc){
                    maxOcc= currentOcc;
                }
            }
        }
        
        return maxOcc;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        
        // Moore's Voting Algorthm
        int count=0;
        int element=nums[0];
        
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                element=nums[i];
            }
            else if(element == nums[i]){
                count++;
            }
            else
                count--;
        }
        
        int majoritynum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element)
                majoritynum++;
        }
        
        if(majoritynum>nums.length/2)
            return element;
        else
            return -1;
    }
}
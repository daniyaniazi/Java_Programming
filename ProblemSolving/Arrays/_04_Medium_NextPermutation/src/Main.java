class Solution {
    public void nextPermutation(int[] nums) {
        int cutPoint = -1;
        for(int i=nums.length-2;  i>=0 ; i--){
            if(nums[i]<nums[i+1]){
                cutPoint=i;
                break;
            }
        }
        
        if(cutPoint==-1){
            reverse(nums);
            return;
        }
        
        // Find the minimum large number after cutpoint
        for(int i = nums.length-1 ; i> cutPoint;i--){
            if(nums[i]>nums[cutPoint]){
                // swap
                swap(nums,i,cutPoint);
                break;
            }
        }
        
        //  reverse the remaining arr
        reverse(nums, cutPoint+1, nums.length-1);
        return;
        
    }
    
    
    public void reverse(int[] array, int i, int j) {
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
    
    public void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
    
    
    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
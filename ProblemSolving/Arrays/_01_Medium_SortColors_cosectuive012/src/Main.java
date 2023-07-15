public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public void sortColors(int[] nums) {
        // Dutch National Flag Algorithm
        int low=0;int mid=0;
        int high = nums.length-1;
        
        while(mid<=high){
            if(nums[mid]==0){
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(mid,high,nums);
                high--;
            }
        }
    }
    
    public void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}
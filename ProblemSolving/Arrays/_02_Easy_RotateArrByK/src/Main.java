class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp= new int[nums.length];

        for(int i =0;i<nums.length;i++){
            temp[(i+k)%nums.length]=nums[i];
        }
        for(int i =0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        return;
    }
}
class OptimizedSolution
{
    void reverseArray(long arr[], int start, int end) {
        while (start < end) {
            long temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    void leftRotate(long arr[], int k, int n) {
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        reverseArray(arr, 0, n - 1);
    }
    
    
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

// O(2N) TC
// O(N) SC
class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int index=0;
        // 0(N)
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            temp[index] = nums[i];
            index++;
        }
        // O(N)
        for(int i=0;i<nums.length;i++){
            if(i==index){
                nums[i]=0;
            }
            nums[i]=temp[i];
        }
    }
}


class BetterSolution {
    public void moveZeroes(int[] nums) {
        int index=0;
        // O(N)
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            nums[index]=nums[i];
            index++;
        }
        // O(N-X)
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
    }
}


class TwoPointerProblem {
    public void moveZeroes(int[] nums) {
        int zeroIndex=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroIndex = i;
                break;
            }
        }
        
        if(zeroIndex > -1){
            for(int i=zeroIndex+1;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[zeroIndex]=nums[i];
                    nums[i]=0;
                    zeroIndex++;
                }
            }
        }
        
    }
}
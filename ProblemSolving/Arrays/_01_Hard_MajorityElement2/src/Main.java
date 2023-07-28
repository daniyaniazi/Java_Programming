import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0;int ele1=Integer.MIN_VALUE;
        int count2=0;int ele2=Integer.MIN_VALUE;;
        
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=ele2){
                count1=1;
                ele1=nums[i];
            }
            else if(count2==0 && nums[i]!=ele1){
                count2=1;
                ele2=nums[i];
            }
            else if(nums[i]==ele1) count1++;
            else if (nums[i]==ele2) count2++;
            else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        List<Integer> maj= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1){
                count1++;
                
            }
            else if(nums[i]==ele2){
                count2++;
                
            }
        }
        if(count1>=(nums.length/3)+1) maj.add(ele1);
        if(count2>=(nums.length/3)+1) maj.add(ele2);
        return maj;
    }
}
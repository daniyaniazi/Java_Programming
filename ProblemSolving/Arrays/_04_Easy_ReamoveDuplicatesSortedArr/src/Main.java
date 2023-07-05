
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class BruteForceSolution{
    public int removeDuplicates(int[] nums) {
        //         HashSet :  does not guarantee the original order of elements
        LinkedHashSet<Integer> set = new LinkedHashSet<>(); // SC : O(N)
        for (int n : nums) {
            set.add(n); // TC : O(NLOGN)
        }
        
        int index = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            nums[index] = iterator.next();
            index++;
        }
        
        return set.size();
    }
}



class OptimizedSolution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int j = 1;j<nums.length;j++) {
            if(nums[index]!=nums[j]){
                nums[index+1] = nums[j];
                index++;
            }
        }
        return index+1;
        
    }
}
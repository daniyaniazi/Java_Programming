import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class BruteForce {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        HashSet<List<Integer>> triplets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    // ON3
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>(
                                Arrays.asList(nums[i], nums[j], nums[k]));
                        // O(3)
                        Collections.sort(temp);
                        triplets.add(temp);
                    }
                }
            }
        }
        for (List<Integer> list : triplets) {
            answer.add(list);
        }
        return answer;
    }
}

class BetterSolutionUsingInBetweenHashSet {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        HashSet<List<Integer>> triplets = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> between = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                // O(N2)
                int third = - (nums[i]+nums[j]);
                if(between.contains(third)){
                    List<Integer> triplet = new ArrayList<>(
                            Arrays.asList(nums[i],nums[j],third));
                    Collections.sort(triplet);
                    triplets.add(triplet);
                }
                between.add(nums[j]);
            }
        }
        for(List<Integer> list : triplets){
            answer.add(list);
        }
        return answer;
    }
}

class OptimalSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        // O(nlogn)
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                // On2
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if( sum>0) k--;
                else
                {
                    answer.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j< k && nums[k]== nums[k+1]) k--;
                }
            }
        }
        return answer;
    }
}
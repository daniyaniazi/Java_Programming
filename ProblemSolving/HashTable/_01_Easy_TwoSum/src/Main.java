import java.util.HashMap;
import java.util.Map;

class Main {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap();
        //   secondIntegar , index
        for(int i=0;i<nums.length;i++){
            int firstInteger = nums[i];
            int secondIntegar = target - nums[i];
            if (map.containsKey(secondIntegar))
            {
                return new int[] { map.get(secondIntegar), i };
            }
            map.put(firstInteger,i);
        }
        return new int[] {};
    }
}
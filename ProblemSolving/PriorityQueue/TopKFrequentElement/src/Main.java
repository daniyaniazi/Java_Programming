import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for (int num : nums) count.put(num, count.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) ->
                        b.getValue() - a.getValue()
        );
        for (Map.Entry entry: count.entrySet()) {
            pq.add(entry);
        }
        int[] output = new int[k];
        for (int i = 0; i < k; i++) output[i] = pq.poll().getKey();
        return output;
    }

}  
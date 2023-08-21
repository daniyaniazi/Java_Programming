// https://www.codingninjas.com/studio/problems/missing-and-repeating-numbers_6828164
public class Solution {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        long n = a.length;
        long Sn = (n * (n + 1)) / 2;
        long Sn2 = (n * (n + 1) * (2 * n + 1)) / 6;
        // S - Sn
        // S2 - Sn2
        long S = 0;
        long S2 = 0;
    
        for (int j : a) {
            S += j;
            S2 += (long) j * j;
        }
        
        long equation1 = S - Sn;
        long equation2 = ((n * equation1 * equation1) - Sn2) / equation1;
        
        long x = (equation1 + equation2) / 2;
        long y = x - equation1;
        
        return new int[]{(int) x, (int) y};
    }
}
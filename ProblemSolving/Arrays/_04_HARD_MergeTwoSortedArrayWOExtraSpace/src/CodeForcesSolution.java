import java.util.Arrays;

// https://www.codingninjas.com/studio/problems/merge-two-sorted-arrays-without-extra-space_6898839
public class CodeForcesSolution {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {
        
        int left = a.length - 1;
        int right = 0;
        while (left >= 0 && right < b.length) {
            if (a[left] > b[right]) {
                long temp = a[left];
                a[left] = b[right];
                b[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
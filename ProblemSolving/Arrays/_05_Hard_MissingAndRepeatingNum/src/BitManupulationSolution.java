public class BitManupulationSolution {
    
        public static int[] findMissingRepeatingNumbers(int[] a) {
            int n = a.length;
            int xr = 0;
            
            for (int i = 0; i < n; i++) {
                xr = xr ^ a[i];
                xr = xr ^ (i + 1);
            }
            
            int bitNo = 0;
            
            while (true) {
                if ((xr & (1 << bitNo)) != 0) {
                    break;
                }
                bitNo++;
            }
            
            int zero = 0;
            int one = 0;
            
            for (int i = 0; i < n; i++) {
                if ((a[i] & (1 << bitNo)) != 0) {
                    one ^= a[i];
                } else {
                    zero ^= a[i];
                }
            }
            
            for (int i = 1; i <= n; i++) {
                if ((i & (1 << bitNo)) != 0) {
                    one ^= i;
                } else {
                    zero ^= i;
                }
            }
            
            int repeatCount = 0;
            
            for (int i = 0; i < n; i++) {
                if (a[i] == one) {
                    repeatCount++;
                }
            }
            
            if (repeatCount == 2) {
                return new int[]{one, zero};
            } else {
                return new int[]{zero, one};
            }
        }
 
}
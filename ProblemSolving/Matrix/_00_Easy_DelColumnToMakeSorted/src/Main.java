class Solution {
    public int minDeletionSize(String[] strs) {
        int columnSize = strs[0].length();
        int delCount = 0;
        for (int col = 0; col < columnSize; col++) {
            for (int row = 1; row < strs.length; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    delCount++;
                    break;
                }
            }
        }

        return delCount;
    }
}
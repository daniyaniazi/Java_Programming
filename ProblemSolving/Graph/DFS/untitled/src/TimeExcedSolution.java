class Solution {
    public int findMinArrowShots(int[][] points) {
        int n=points.length;
        int count=1;
        int[][] sortedArr = sortArray(points);
        //sort(begin(points),end(points));
        // Arrays.sort(points);
        System.out.println(sortedArr);
        int[] prev= sortedArr[0];

        for(int i = 1; i<sortedArr.length ; i++)
        {
            int currStartPoint = sortedArr[i][0];
            int currEndPoint = sortedArr[i][1];

            int prevStartPoint = prev[0];
            int prevEndPoint = prev[1];

            if(currStartPoint>prevEndPoint){
                // no overlap
                count++;
                prev = sortedArr[i];
            }
            else{
                // overlap
                prev[0]=Math.max(prevStartPoint,currStartPoint);
                prev[1]=Math.min(prevEndPoint,currEndPoint);
            }
        }
        return count;
    }

    public int[][] sortArray (int[][] a){
        int[] temp;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i][0] > a[j][0])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

}
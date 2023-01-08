class Solution {
    public int maxPoints(int[][] points) {
        int n=points.length;

        if(n==1){
            return 1;
        }
        int result=0;

        for(int i=0;i<n;i++){
            HashMap<Double,Integer> map=new HashMap();
            for(int j=0;j<n;j++){
                if(j==i) continue;
                double theta;
                double dy=points[j][1]-points[i][1];
                double dx=points[j][0]-points[i][0];
                if (dx == 0) theta= Double.MAX_VALUE;
                else if (dy == 0) theta= 0;
                else  theta= dy/dx;
                map.put(theta,map.getOrDefault(theta, 0)+1);
                result=Math.max(result,map.get(theta));
            }
        }
        return result+1;
    }
}
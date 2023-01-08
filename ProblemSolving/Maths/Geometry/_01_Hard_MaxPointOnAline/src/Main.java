class Solution {
    public int maxPoints(int[][] points) {
        int n=points.length;

        if(n==1){
            return 1;
        }
        int result=0;
        for(int p1=0;p1<n;p1++){

            for(int p2=p1+1;p2<n;p2++){

                int count=2;
                int dx=points[p2][0]-points[p1][0];
                int dy=points[p2][1]-points[p1][1];
                    /*
                                    dy/dx = dy_/dx_
                                    dy*dx_ = dy_*dx
                    */


                for(int p3=0;p3<n;p3++)
                {

                    if(p3!=p1&&p3!=p2)
                    {
                        int dx_=points[p3][0]-points[p1][0];
                        int dy_=points[p3][1]-points[p1][1];
                        if(dy*dx_ == dy_*dx) count++;
                        System.out.println(count);
                    }

                }

                result = Math.max(result,count);
            }

        }
        return result;
    }
}
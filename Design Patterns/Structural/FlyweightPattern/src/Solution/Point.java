package Solution;

import Problem.PointType;

public class Point {
    private  int x;
    private  int y;
    
    private  PointIcon pointIcon;
   
    
    public Point(int x, int y, PointIcon pointIcon) {
        this.x = x; // 4 bytes
        this.y = y; // 4 bytes
        this.pointIcon = pointIcon;
      
    }
    
    public  void draw()
    {
        System.out.printf("%s at (%d,%d)", pointIcon.getType(),x,y);
    }

}
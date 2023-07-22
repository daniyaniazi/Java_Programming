package Problem;

public class Point {
    private  int x;
    private  int y;
    private  PointType type;
    private  byte[] icon;
    
    public Point(int x, int y, PointType type, byte[] icon) {
        this.x = x; // 4 bytes
        this.y = y; // 4 bytes
        this.type = type;  // 4 bytes
        this.icon = icon; // 20 kb
    }
    
    public  void draw()
    {
        System.out.printf("%s at (%d,%d)", type,x,y);
    }

}
package Problem;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    
    public List<Point> getPoints(){
        List<Point> points = new ArrayList<>();
        
        Point point1 = new Point(1,2,PointType.CAFE, null);
        points.add(point1);
        return points;
        
    }
}
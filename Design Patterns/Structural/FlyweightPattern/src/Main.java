import Problem.Point;
import Problem.PointService;
import Solution.PointIconFactory;

public class Main {
    public static void main(String[] args) {
    
        PointService service =  new PointService();
        
        for (Point point : service.getPoints())
            point.draw();
        
    //     FLYWEIGHT
        Solution.PointService pointService= new Solution.PointService(new PointIconFactory());
        for (Solution.Point point : pointService.getPoints())
            point.draw();
    }
}
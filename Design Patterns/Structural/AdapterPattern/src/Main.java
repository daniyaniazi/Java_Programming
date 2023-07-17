import Problem.Image;
import Problem.ImageView;
import Problem.VividFilter;
import Solution.CaramelFilter;
import avaFilters.Caramel;

public class Main {
    public static void main(String[] args) {
    
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        // Apply method expects Filter
        // imageView.apply(new Caramel());
    
        imageView.apply(new CaramelFilter(new Caramel()));
    
    
    
    }
}
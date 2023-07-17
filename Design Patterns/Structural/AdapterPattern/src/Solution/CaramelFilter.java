package Solution;

import Problem.Filter;
import Problem.Image;
import avaFilters.Caramel;

public class CaramelFilter implements Filter {
    
    // Composition or we can use Inheritance
    private Caramel caramel;
    
    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }
    
    @Override
    public  void  apply(Image image){
        // Lib specifications code
        caramel.init();
        caramel.render(image);
    }
}
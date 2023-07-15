package Problem;

import java.util.ArrayList;
import java.util.List;

public class Group {
    
    // change shape to Object
    private List<Object> objects = new ArrayList<>();
    
    public void add(Object shape) {
        this.objects.add(shape);
    }
    
    public void render() {
        for (Object shape: objects) {
            // object dont have render method
            if(shape instanceof  Shape)
                // cast - PROBLEM
                ((Shape) shape).render();
            else
                ((Group) shape).render();
        }
    }
    
    // Move resize
    // diff instance
}
// import Problem.Group;
// import Problem.Shape;

import Solution.Group;
import Solution.Shape;

public class Main {
    public static void main(String[] args) {
        
        var group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());
    
        var group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());
    
    
        var group = new Group();
        group.add(group1);
        group.add(group2);
        // need to change the imp
        group.render();
    }
}
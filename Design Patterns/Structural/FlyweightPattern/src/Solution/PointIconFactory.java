package Solution;

import Problem.PointType;

import java.util.HashMap;

public class PointIconFactory {
    
    private HashMap<PointType, PointIcon> icons = new HashMap<>();
    
    
    public  PointIcon getPointIcon(PointType type){
        if(!icons.containsKey(type)){
            // no same icon multiple time
            PointIcon icon = new PointIcon(type,null);
            icons.put(type,icon);
        }
        
        return  icons.get(type);
    }
    
}
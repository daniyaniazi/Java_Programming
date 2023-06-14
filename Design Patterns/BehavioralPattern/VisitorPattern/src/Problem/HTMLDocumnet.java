package Problem;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocumnet {
    
    private List<IHTMLNode> nodes = new ArrayList<>();
    
    public void add(IHTMLNode node){
        nodes.add(node);
    }
    
    public  void highlight(){
        for (IHTMLNode node : nodes) {
            node.highlight();
        }
    }
}
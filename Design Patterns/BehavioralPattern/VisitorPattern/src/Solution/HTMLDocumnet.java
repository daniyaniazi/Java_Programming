package Solution;

import Solution.IHTMLNode;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocumnet {
    
    private List<Solution.IHTMLNode> nodes = new ArrayList<>();
    
    public void add(Solution.IHTMLNode node){
        nodes.add(node);
    }
    
    public  void execute(IOperation operation){
        for (IHTMLNode node : nodes) {
            node.exceute(operation);
        }
    }
}
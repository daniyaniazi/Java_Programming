package Solution;

import Solution.IHTMLNode;

public class AnchorNode implements IHTMLNode {
    
    @Override
    public void exceute(IOperation operation) {
        operation.apply(this);
    }
}
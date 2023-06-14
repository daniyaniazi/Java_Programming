package Solution;

import Solution.IHTMLNode;

public class HeadingNode implements IHTMLNode {
   
    @Override
    public void exceute(IOperation operation) {
        operation.apply(this);
    }
}
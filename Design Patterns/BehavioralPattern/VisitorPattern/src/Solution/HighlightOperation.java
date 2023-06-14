package Solution;

public class HighlightOperation implements  IOperation {
    
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Highlight Heading");
    }
    
    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Highlight Anchor");
    }
}
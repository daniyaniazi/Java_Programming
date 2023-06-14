package Solution;

public class ExtractPlainTextOperation implements IOperation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Extracting heading");
    }
    
    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Extracting Anchor Text");
    }
}
// import Problem.AnchorNode;
// import Problem.HTMLDocumnet;
// import Problem.HeadingNode;

import Solution.*;

public class Main {
    public static void main(String[] args) {
    
        HTMLDocumnet document = new HTMLDocumnet();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());
        document.execute(new ExtractPlainTextOperation());
        
    //    Extract Plain text from node document.getPlainText();
    //    new method - VIOLATES OPEN CLOSE PRINCIPLE
    //    document.highlight()
    
    
    }
}
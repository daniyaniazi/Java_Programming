package Implementation;

public class BrushTool  implements Tool {

    @Override
    public void mouseDown() {

        System.out.println("BrushTool ICON");
    }

    @Override
    public void mouseUp() {
        System.out.println("DRAW LINE");
    }

    }
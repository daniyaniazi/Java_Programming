package Implementation;

public class SelectionTool implements Tool {

    @Override
    public void mouseDown() {

        System.out.println("SELECTION ICON");
    }

    @Override
    public void mouseUp() {
        System.out.println("DRAW DASH RECTANGLE");

    }
}

import Implementation.Canvas;
import Implementation.SelectionTool;

public class Main {
    public static void main(String[] args) {

        Canvas myCanvas = new Canvas();

        myCanvas.setCurrentTool(new SelectionTool());
        myCanvas.mouseUp();
        myCanvas.mouseDown();

    }
}
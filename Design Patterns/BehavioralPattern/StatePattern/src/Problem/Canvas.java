package Problem;

public class Canvas {

    ToolType currentTool;

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseUp(){

        // Longer Decision Making
        if (currentTool == ToolType.SELECTION){
            System.out.println("SELECTION TOOL - SELECT");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("ERASER TOOL - ERASED");
        }else if (currentTool == ToolType.BRUSH) {
            System.out.println("BRUSH TOOL - DRAW");
        }

    }
    public void mouseDown(){
        if (currentTool == ToolType.SELECTION){
            System.out.println("SELECTION TOOL SELECTED");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("ERASER TOOL SELECTED");
        }else if (currentTool == ToolType.BRUSH) {
            System.out.println("BRUSH TOOL SELECTED");
        }
    }
}

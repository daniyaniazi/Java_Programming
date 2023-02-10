package Implementation;

import Problem.ToolType;

public class Canvas {

    Tool currentTool;

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseUp(){
        currentTool.mouseUp();
    }
    public void mouseDown(){
        currentTool.mouseDown();
    }
}

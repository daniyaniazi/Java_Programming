package Solution;

import Solution.Framework.ICommand;

public class ResizeCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("Resizing Image");
    }
}

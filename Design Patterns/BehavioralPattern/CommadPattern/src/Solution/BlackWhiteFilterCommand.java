package Solution;

import Solution.Framework.ICommand;

public class BlackWhiteFilterCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("Black and White Filter");
    }
}

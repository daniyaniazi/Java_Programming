package Solution.Editor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class History {

    private Deque<IUndoableCommand> commandList = new ArrayDeque<>();

    public void push(IUndoableCommand command) {
        commandList.add(command);
    }

    public IUndoableCommand pop(){
        return commandList.pop();
    }

}

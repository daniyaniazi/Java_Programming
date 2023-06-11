package Solution.Editor;

public interface IUndoableCommand extends ICommand{

     void unexecute();
}


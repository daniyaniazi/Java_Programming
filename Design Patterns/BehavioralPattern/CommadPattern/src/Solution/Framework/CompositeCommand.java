package Solution.Framework;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements ICommand{

    private List<ICommand> commands= new ArrayList<>();


    public void add(ICommand command){
        commands.add(command);
    }
    @Override
    public void execute() {
        for (ICommand command: commands) {
            command.execute();
        }
    }
}

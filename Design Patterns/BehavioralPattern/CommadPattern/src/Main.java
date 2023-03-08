import Solution.BlackWhiteFilterCommand;
import Solution.CustomerServiceApp;
import Solution.Framework.AddCustomerCommand;
import Solution.Framework.Button;
import Solution.Framework.CompositeCommand;
import Solution.Framework.ICommand;
import Solution.ResizeCommand;

public class Main {
    public static void main(String[] args) {

        CustomerServiceApp customerService = new CustomerServiceApp();
        ICommand command = new AddCustomerCommand(customerService);
        Button button = new Button(command);
        button.click();

        // COMPOSITE COMMAND
        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(new ResizeCommand());
        compositeCommand.add(new BlackWhiteFilterCommand());
        compositeCommand.execute();
    }
}
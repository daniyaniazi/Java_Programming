import Solution.CustomerServiceApp;
import Solution.Framework.AddCustomerCommand;
import Solution.Framework.Button;
import Solution.Framework.ICommand;

public class Main {
    public static void main(String[] args) {

        CustomerServiceApp customerService = new CustomerServiceApp();
        ICommand command = new AddCustomerCommand(customerService);
        Button button = new Button(command);
        button.click();
    }
}
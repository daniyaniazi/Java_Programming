package Solution.Framework;

import Solution.CustomerServiceApp;

public class AddCustomerCommand implements ICommand{

    private CustomerServiceApp service;

    public AddCustomerCommand(CustomerServiceApp service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}

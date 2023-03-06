package Solution;

import Problem.AuditTrail;

public class TransferMoneyConcreteTask extends Task{

//    public TransferMoneyConcreteTask(AuditTrail auditTrail) {
//        super(auditTrail);
//    }

    @Override
    // Protected !
    protected void doExecute() {
        System.out.println("Transfer Money");
    }
}

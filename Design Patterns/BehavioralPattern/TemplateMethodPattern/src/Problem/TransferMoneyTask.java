package Problem;

public class TransferMoneyTask {

    private  AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public  void execute(){
        // record who perform the task
        auditTrail.record();

        // Implementation for money transfer
        System.out.println("Transfer Money");
    }
}

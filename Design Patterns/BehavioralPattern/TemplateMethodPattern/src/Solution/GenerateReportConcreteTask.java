package Solution;

import Problem.AuditTrail;

public class GenerateReportConcreteTask extends Task{

    public GenerateReportConcreteTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Generate Report");
    }
}

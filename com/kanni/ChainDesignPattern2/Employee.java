package com.kanni.ChainDesignPattern2;

import java.util.concurrent.atomic.AtomicBoolean;

public class Employee extends EscalationPattern {

    EscalationPattern nextLevelEscalate;

    AtomicBoolean callActivate = new AtomicBoolean(false);

    public Employee(EscalationPattern escalationPattern) {
        this.nextLevelEscalate = escalationPattern;
    }

    @Override
    public void escalate(Call call) {
        System.out.println("***********************************");
        System.out.println("Escalation Pattern ");
        System.out.println("**************************");

        while (callActivate.get()) {
            System.out.println("Ring going on Employee Level, Please wait for some time. MR/MIS "+call.callId);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("OPS !!! , your Call is escalate next Level 2 !!! wait for sometimes!!!!");
            nextLevelEscalate.active(true);
            nextLevelEscalate.escalate(call);

            active(false);
        }

    }

    @Override
    public void active(boolean flag) {
        callActivate.set(flag);
    }
}

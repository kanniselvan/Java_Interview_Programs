package com.kanni.ChainDesignPattern2;

import java.util.concurrent.atomic.AtomicBoolean;

public class CEO extends EscalationPattern{

    AtomicBoolean callActivate=new AtomicBoolean(false);

    @Override
    public void escalate(Call call) {
        System.out.println("===================================");
        System.out.println("Ring going on CEO Level, Please wait for some time. MR/MIS "+call.callId);
        while (callActivate.get()) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         System.out.println("Acknowledge your compliant from CEO !!!  Thanks. MR/MIS "+call.callId);
            System.out.println("===================================");
            active(false);

        }
    }


    @Override
    public void active(boolean flag) {
        callActivate.set(flag);
    }
}

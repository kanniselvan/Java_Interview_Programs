package com.kanni.ChainDesignPattern2;

public class EscalationDemo {
    public static void main(String[] args) {

        CEO ceo=new CEO();
        Lead lead=new Lead(ceo);
        Employee employee=new Employee(lead);

        Call call=new Call(12344);
        employee.active(true);
        employee.escalate(call);

    }
}

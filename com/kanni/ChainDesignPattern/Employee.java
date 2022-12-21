package com.kanni.ChainDesignPattern;

public class Employee extends LeaveApproval {

    LeaveApproval nextLevel;

    public Employee(LeaveApproval leaveApproval) {
        this.nextLevel = leaveApproval;
    }

    @Override
    public void approve(Leave leave) {
        System.out.println("***********************************");
        System.out.println("Leave Approval  Pattern ");
        System.out.println("**************************");

        if (null != leave && leave.getDayOfLeave() == 1) {
            System.out.println("hello ! , Employee : " + leave.getEmpId());
            System.out.println("Reason : " + leave.getReason() + ". System get approved your Leave!!!!!!");
        } else {
            System.out.println("hello ! , Employee : " + leave.getEmpId() + ". Your Leave request going next level approval!!!");
            nextLevel.approve(leave);
        }

    }
}

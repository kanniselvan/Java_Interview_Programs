package com.kanni.ChainDesignPattern;

public class Manager extends LeaveApproval {

    LeaveApproval nextLevel;

    public Manager(LeaveApproval leaveApproval) {
        this.nextLevel = leaveApproval;
    }

    @Override
    public void approve(Leave leave) {
        System.out.println("===================================");
        System.out.println("Manager got your request!!!!!!!!!!!!!!!!");
        if (null != leave && leave.getDayOfLeave()  <= 5) {
            System.out.println("hello ! , Employee : "+leave.getEmpId());
            System.out.println("Reason : "+leave.getReason()+". Manager get approved your Leave!!!!!!");
        } else {
            System.out.println("hello ! , Employee : "+leave.getEmpId() +". Your Leave request going next level approval!!!");
            nextLevel.approve(leave);
        }
    }
}

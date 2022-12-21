package com.kanni.ChainDesignPattern;

public class TeamLeader extends LeaveApproval {

    LeaveApproval nextLevel;

    public TeamLeader(LeaveApproval leaveApproval) {
        this.nextLevel = leaveApproval;
    }


    @Override
    public void approve(Leave leave) {
        System.out.println("===================================");
        System.out.println("TeamLead got your request!!!!!!!!!!!!!!!!");
        if (null != leave && leave.getDayOfLeave() <= 3) {
            System.out.println("hello ! , Employee : "+leave.getEmpId());
            System.out.println("Reason : " + leave.getReason() + ". TeamLeader got approved your Leave!!!!!!");
        } else {
            System.out.println("hello ! , Employee : "+leave.getEmpId() +". Your Leave request going next level approval!!!");
            nextLevel.approve(leave);
        }
    }
}

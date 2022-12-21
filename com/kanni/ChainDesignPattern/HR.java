package com.kanni.ChainDesignPattern;

public class HR extends LeaveApproval {

    @Override
    public void approve(Leave leave) {
        System.out.println("===================================");
        System.out.println("Manager got your request!!!!!!!!!!!!!!!!");

        System.out.println("hello ! , Employee : "+leave.getEmpId());
        if (null != leave && leave.getDayOfLeave() <= 10) {
            System.out.println("Reason : " + leave.getReason() + ". HR get approved your Leave!!!!!!");
        }else{
            System.out.println("Your Leave request rejected!!!!!!!!!! ");
        }
    }
}

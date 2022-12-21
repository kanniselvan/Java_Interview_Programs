package com.kanni.ChainDesignPattern;

public class Leave {

    private int empId;

    private int dayOfLeave;


    private String reason;

    public Leave(int empId, int dayOfLeave, String reason) {
        this.empId = empId;
        this.dayOfLeave = dayOfLeave;
        this.reason = reason;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getDayOfLeave() {
        return dayOfLeave;
    }

    public void setDayOfLeave(int dayOfLeave) {
        this.dayOfLeave = dayOfLeave;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}

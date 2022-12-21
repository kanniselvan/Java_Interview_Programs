package com.kanni.ChainDesignPattern;

public class LeaveApprovalPattern {
    public static void main(String[] args) {
        HR hr=new HR();
        Manager manager=new Manager(hr);
        TeamLeader teamLeader=new TeamLeader(manager);
        Employee employee=new Employee(teamLeader);

        Leave emp1=new Leave(12345,16,"Family Function");
        Leave emp2=new Leave(12345,1,"Sick Leave");
        Leave emp3=new Leave(12345,3,"Temple Festival");
        Leave emp4=new Leave(12345,2,"Not Well");
        Leave emp5=new Leave(12345,4,"Vacation");

        employee.approve(emp5);

    }
}

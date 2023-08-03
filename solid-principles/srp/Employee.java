package solid.live.srp;


public class Employee {
    private int empId, leavesTaken, totalLeaveAllowed, leaveTaken, yearsInOrg, thisYeard;
    private static int TOTAL_LEAVES_ALLOWED = 30;
    private double monthlySalary;
    private String name, addressStreet, addressCity, addressCountry, manager;
    private int[] leavesLeftPreviously;

    public Employee() {

    }

    public String getName(){
        return name;
    }

    public String getManager(){
        return manager;
    }

    public int getEmpId() {
        return empId;
    }

    public int getYearsInOrg(){
        return yearsInOrg;
    }

    public int getTotalLeaveAllowed(){
        return totalLeaveAllowed;
    }

    public int getLeaveTaken(){
        return leaveTaken;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }

    public int[] getLeavesLeftPreviously(){
        return leavesLeftPreviously;
    }

    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public boolean checkManager(String manager){
        return manager != null;
    }

    public int getTotalLeaveLeftPreviously(int years, int yearsInOrg, int[] leavesLeftPreviously){
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg-i-1];
        }
        return totalLeaveLeftPreviously;
    }
}
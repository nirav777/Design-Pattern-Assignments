package solid.live.srp;

public class EmployeeFormatter{

    Employee employee = new Employee();

    public String toHtml() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpId() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (employee.getTotalLeaveAllowed() - employee.getLeaveTaken()) + "</span>";
        str += "<span>" + Math.round(employee.getMonthlySalary() * 12) + "</span>";
        if (employee.checkManager(employee.getManager())) {
            str += "<span>" + employee.getManager() + "</span>";
        }
        else {
            str += "<span>None</span>";
        }

        int years = 3;
        if (employee.getYearsInOrg() < 3) {
            years = employee.getYearsInOrg();
        }
        int totalLeaveLeftPreviously = employee.getTotalLeaveLeftPreviously(years, employee.getYearsInOrg(), employee.getLeavesLeftPreviously());

        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
}

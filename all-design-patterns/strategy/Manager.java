package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:37:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Manager extends Validations implements SalaryAndMonthsSpentStrategy{
    private String managementBand;
    int salary, monthsSpent;

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        this.salary = salary;
    }

    public void setMonthsSpent(int months) {
        this.monthsSpent = months;
    }

    public int getMonthSpent(){
        return monthsSpent;
    }

    public int getSalary(){
        return salary;
    }

    public void setManagementBand(String managementBand) {
        notEmpty(managementBand);
        this.managementBand = managementBand;
    }
}

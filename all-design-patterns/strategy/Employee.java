package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:31:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee extends GenericEmployee implements SalaryAndMonthsSpentStrategy{
    private int maxAllowedLeaves;
    int monthsSpent,salary;

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        this.salary = salary;
    }

    @Override
    public void setMonthsSpent(int months) {
        super.setMonthsSpent(months);
        this.monthsSpent = months;
    }

    public int getMonthSpent(){
        return monthsSpent;
    }

    public int getSalary(){
        return salary;
    }

    public void setMaxAllowedLeaves(int leaves) {
        atLeast(leaves, 1);
        this.maxAllowedLeaves = leaves;
    }
}


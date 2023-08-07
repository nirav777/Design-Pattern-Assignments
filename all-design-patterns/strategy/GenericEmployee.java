package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:27:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class GenericEmployee extends Validations implements SalaryAndMonthsSpentStrategy {
    String mgrName;
    int salary, monthSpent;

    public void setSalary(int salary) {
        super.setSalary(salary);
        atMost(salary, 1000);
        this.salary = salary;
    }

    public void setMonthsSpent(int months) {
        atLeast(months, 0);
        this.monthSpent = months;
    }

    public int getSalary(){
        return salary;
    }

    public int getMonthSpent(){
        return monthSpent;
    }

    public void setManagerName(String name) {
        super.setManagerName(name);
        notEmpty(name);
        this.mgrName = name;
    }


}

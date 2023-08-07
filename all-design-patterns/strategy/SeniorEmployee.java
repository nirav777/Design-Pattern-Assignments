package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:35:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeniorEmployee extends GenericEmployee implements SalaryAndMonthsSpentStrategy {
    private int setMaxBonus, salary, monthsSpent;

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        atLeast(salary, 200);
    }

    @Override
    public void setMonthsSpent(int months) {
        super.setMonthsSpent(months);
        atLeast(months, 60);
    }

    public int getMonthSpent(){
        return monthsSpent;
    }

    public int getSalary(){
        return salary;
    }

    public void setMaxBonus(int bonus) {
        atLeast(bonus, 1);
        this.setMaxBonus = bonus;
    }
}

package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:14:31 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CompanyMember {
    private String name;
    protected String mgrName;
    protected int salary;
    protected int monthsSpent;

    SalaryAndMonthsSpentStrategy strategyInterface;

    public CompanyMember(SalaryAndMonthsSpentStrategy strategyInterface){
        this.strategyInterface = strategyInterface;
    }

    public void getSalary(){
        strategyInterface.getSalary();
    }

    public void getMonthsSpent(){
        strategyInterface.getMonthSpent();
    }
}

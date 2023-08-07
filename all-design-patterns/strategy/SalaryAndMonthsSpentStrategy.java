package net.media.training.designpattern.strategy;

interface SalaryAndMonthsSpentStrategy {
    public void setSalary(int salary);
    public void setMonthsSpent(int months);
    public int getSalary();
    public int getMonthSpent();
}

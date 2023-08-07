package net.media.training.designpattern.strategy;

public class Validations {
    protected void validateLength(String val, int allowedLength) {
        if (val.length() > allowedLength)
            throw new RuntimeException("Invalid length:" + allowedLength);
    }

    protected void notEmpty(String val) {
        if (val == null || val.length() == 0)
            throw new RuntimeException("not empty check failed for value:" + val);
    }

    protected void atLeast(int val, int min) {
        if (val < min)
            throw new RuntimeException("at least check failed:" + val);
    }

    protected void atMost(int val, int max) {
        if (val > max)
            throw new RuntimeException("at most check failed:" + val);
    }

    public void setName(String name) {
        validateLength(name, 50);
    }

    public void setSalary(int salary) {
        atLeast(salary, 1);
    }

    public void setManagerName(String name) {
        validateLength(name, 50);
    }
}

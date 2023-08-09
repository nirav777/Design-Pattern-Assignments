package net.media.training.designpattern.decorator;

public abstract class Decorator implements Criteria{
    public abstract boolean evaluate(Application application);
}

package net.media.training.designpattern.composite;

public interface Composite {
    String getName();
    int getSize();
    Composite getParent();
    void setParent(Composite parent);
}

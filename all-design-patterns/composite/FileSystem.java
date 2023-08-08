package net.media.training.designpattern.composite;

public interface FileSystem {


    String getName();
    int getSize();
    Directory getParent();
    void setParent(Directory directory);
}

package net.media.training.designpattern.observer;

public interface Observer {
    public void notifySunRose();
    public void notifySunSet();
    public boolean isOutdoors();
    public void goIndoors();
    public boolean isFeelingWarm();
    public boolean isFeelingTired();
}

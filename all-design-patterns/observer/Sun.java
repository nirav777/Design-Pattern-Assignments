package net.media.training.designpattern.observer;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sun {
    private boolean isUp;
    List<Observer> observerList = new ArrayList<>();

    public Sun(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public boolean isUp() {
        return isUp;
    }

    public void set() {
        isUp = false;

        for(Observer observer: observerList){
            observer.notifySunSet();
        }
    }

    public void rise() {
        isUp = true;

        for(Observer observer: observerList){
            observer.notifySunRose();
        }
    }
}
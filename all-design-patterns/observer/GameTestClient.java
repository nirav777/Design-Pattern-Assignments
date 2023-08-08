package net.media.training.designpattern.observer;

import java.util.*;

public class GameTestClient {
    public Person person;
    public Sun sun;
    public Dog dog;
    public Cat cat;
    public Robot robot;
    public Game game;

    public void setup() {
        person = new Person();
        dog = new Dog();
        cat = new Cat();
        robot = new Robot();

        List<Observer> observerList = new ArrayList<>();
        observerList.add(person);
        observerList.add(dog);
        observerList.add(cat);
        observerList.add(robot);

        Sun sun = new Sun(observerList);
        game = new Game(sun);
    }

    public void everyoneGoesOut() {
        person.goOutdoors();
        robot.goOutdoors();
        dog.goOutdoors();
        cat.goOutdoors();
    }

    public void everyoneOutdoorsComesIn() {
        for(Observer observer: sun.observerList){
            if(observer.isOutdoors()){
                observer.goIndoors();
            }
        }
    }

    public void tickOnce() {
        game.tick();
    }

    public void tickTwice() {
        game.tick();
        game.tick();
    }

    public boolean outdoorsCharactersFeelWarm() {

        for(Observer observer: sun.observerList){
            if(observer.isOutdoors() && !observer.isFeelingWarm()){
                return false;
            }
        }

        for(Observer observer: sun.observerList){
            if(observer.isOutdoors() && observer.isFeelingWarm()){
                return false;
            }
        }
        return true;
    }

    public boolean allFeelCold() {
        return !person.isFeelingWarm() && !cat.isFeelingWarm() && !dog.isFeelingWarm() && !robot.isFeelingWarm();
    }
}
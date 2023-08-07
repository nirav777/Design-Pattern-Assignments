package net.media.training.designpattern.abstractfactory;

public class PhoneStore {

    public static void main(String[] args) {
        IphoneFactory iphone = new IphoneFactory();
        iphone.buildPhone("Iphone");

        AndroidFactory androidPhone = new AndroidFactory();
        androidPhone.buildPhone("Android");
    }

}

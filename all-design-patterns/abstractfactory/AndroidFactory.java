package net.media.training.designpattern.abstractfactory;

public class AndroidFactory extends PhoneMaker {
    @Override
    public Case buildPhone(String phoneType) {
        Case phoneCase = new Case(phoneType);
        phoneCase.attachScreen(new AndroidScreen(phoneType));
        phoneCase.attachMotherBoard(new AndroidMotherBoard(phoneType));
        return phoneCase.getPhoneCase();
    }
}

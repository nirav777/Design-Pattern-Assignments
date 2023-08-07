package net.media.training.designpattern.abstractfactory;

public class IphoneFactory extends PhoneMaker{
    @Override
    public Case buildPhone(String phoneType) {
        Case phoneCase = new Case(phoneType);
        phoneCase.attachScreen(new IphoneScreen(phoneType));
        phoneCase.attachMotherBoard(new IphoneMotherBoard(phoneType));
        return phoneCase.getPhoneCase();
    }
}

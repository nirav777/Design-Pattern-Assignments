package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:39:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class MotherBoard {
    private Battery battery;
    private String state;
    private Processor processor;
    String phoneType;

    MotherBoard(String phoneType){
        this.phoneType = phoneType;
        MotherBoard motherBoard;
        if (phoneType.equals("Android")) {
            motherBoard = new AndroidMotherBoard(phoneType);
            motherBoard.attachBattery(new Battery());
            motherBoard.attachProcessor(new AndroidProcessor(phoneType));
        } else {
            motherBoard = new IphoneMotherBoard(phoneType);
            motherBoard.attachBattery(new Battery());
            motherBoard.attachProcessor(new IphoneProcessor(phoneType));
        }
    }

    public void attachBattery(Battery battery) {
        this.battery = battery;
    }

    public void attachProcessor(Processor processor) {
        if (battery == null)
            throw new RuntimeException("Cant attach processor without attaching battery");
        this.processor = processor;
        this.state = "running";
    }

    public String State() {
        return state;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Battery getBattery() {
        return battery;
    }
}

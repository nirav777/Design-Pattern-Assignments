package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:43:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Processor {
    String phoneType;
    Processor processor;

    Processor(String phoneType){
        this.phoneType = phoneType;
    }

    public Processor getScreen(){
        if (phoneType.equals("Android")) {
            processor  = new AndroidProcessor(phoneType);
        } else {
            processor = new IphoneProcessor(phoneType);
        }
        return null;
    }
}

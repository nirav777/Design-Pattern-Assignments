package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:40:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Screen {
    Screen screen;
    String phoneType;
    Screen(String phoneType){
        this.phoneType = phoneType;
    }

    public Screen getScreen(){
        if (phoneType.equals("Android")) {
            screen = new AndroidScreen(phoneType);
        } else {
            screen = new IphoneScreen(phoneType);
        }
        return null;
    }

}

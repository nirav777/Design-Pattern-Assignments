package solid.live.dip;


import net.iharder.Base64;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */



public class EncodingModule {
    public void encodeWithFiles() {
        FileReaderAndWriter fileObj = new FileReaderAndWriter();
        fileObj.read();
    }

    public void encodeBasedOnNetworkAndDatabase() {
        NetworkEncoder networkObj = new NetworkEncoder();
        String decodedString = networkObj.getInputString();
        String encodedString = Base64.encodeBytes(decodedString.getBytes());
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
}


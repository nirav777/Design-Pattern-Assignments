package solid.live.dip;

import net.iharder.Base64;

import java.io.*;

public class FileReaderAndWriter implements ReaderInterface {
    public void read(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt"));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.encodeBytes(aLine.getBytes());
                writer.write(encodedLine);
            }
            writer.flush();
            writer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package net.media.training.designpattern.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 4:55:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldManipulator {

    public void fixManipulate(final String fileName, final String newPath) {

        Invoker invoker = new Invoker();
        CreateCommand createCommand = new CreateCommand(fileName, "hello world");
        invoker.addCommand(createCommand);
        UpdateCommand updateCommand = new UpdateCommand(fileName, "new hello world");
        invoker.addCommand(updateCommand);
        MoveCommand moveCommand = new MoveCommand(fileName, newPath);
        invoker.addCommand(moveCommand);

        invoker.executeCommand();

    }


    public void brokenManipulate(String fileName, String newPath) {

        Invoker invoker = new Invoker();

        CreateCommand createCommand = new CreateCommand(fileName, "hello world");
        invoker.addCommand(createCommand);
        UpdateCommand updateCommand = new UpdateCommand(fileName, "new hello world");
        invoker.addCommand(updateCommand);
        MoveCommand moveCommand = new MoveCommand(fileName, newPath);
        invoker.addCommand(moveCommand);
        CreateCommand createCommand1 = new CreateCommand(fileName, "hello world");
        invoker.addCommand(createCommand1);
        CreateCommand createCommand2 = new CreateCommand(fileName, "hello world");
        invoker.addCommand(createCommand2);


        invoker.executeCommand();


        /* int cnt = 0;
        try {
            create(fileName, "hello world");
            cnt = 1;
            update(fileName, "new hello world");
            cnt = 2;
            move(fileName, newPath);
            cnt = 3;
            create(fileName, "hello world");
            cnt = 4;
            create(fileName, "hello world");
            cnt = 5;
        } catch (Exception e) {
            switch (cnt) {
                case 5:
                    delete(fileName);
                case 4:
                    delete(fileName);
                case 3:
                    move(newPath, fileName);
                case 2:
                    update(fileName, "hello world");
                case 1:
                    delete(fileName);

            }
        } */


    }
}

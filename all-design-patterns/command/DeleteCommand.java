package net.media.training.designpattern.command;

import java.io.File;

public class DeleteCommand implements Command{

    String fileName;
    DeleteCommand(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        File file = new File(fileName);
        file.delete();
    }

    @Override
    public void redo() {

    }
}

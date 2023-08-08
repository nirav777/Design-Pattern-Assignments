package net.media.training.designpattern.command;

import java.util.*;

public class Invoker {

    Queue<Command> commandQueue = new PriorityQueue<>();

    public void addCommand(Command command){
        commandQueue.add(command);
    }

    public void executeCommand(){
        int queueSize = commandQueue.size();
        for (int i=0; i<queueSize; i++){
            Command command = commandQueue.poll();
            try{
                command.execute();
            }
            catch(Exception e){
                command.redo();
                break;
            }
        }
    }

}

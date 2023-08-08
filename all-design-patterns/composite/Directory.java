package net.media.training.designpattern.composite;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements FileSystem {
    private final String name;
    private final List<FileSystem> fileSystems;
    private Directory parent;

    public String getName() {
        return name;
    }

    public Directory(String name, List<FileSystem> fileSystems) {
        this.name = name;
        this.fileSystems = fileSystems;

        for (FileSystem fileSystem : fileSystems) {
            fileSystem.setParent(this);
        }
    }

    public int getSize() {
        int sum = 0;

        for (FileSystem fileSystem : this.getFileSystems()) {
            sum += fileSystem.getSize();
        }

        return sum;
    }

    public void setParent(Directory directory) {
        this.parent = directory;
    }


    public void delete() {
        while (this.getFileSystems().size() > 0) {
            FileSystem fileSystem = this.getFileSystems().get(0);
            if(fileSystem instanceof File){
                fileSystem.getParent().removeEntry(fileSystem);
            }
            else{
                Directory dir = (Directory) fileSystem;
                dir.delete();
            }
        }
        this.getParent().removeEntry(this);
    }

//    public void removeEntry(File file) {
//        files.remove(file);
//    }

    public void removeEntry(FileSystem fileSystem) {
        fileSystems.remove(fileSystem);
    }

    public void add(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }

    private boolean fileSystemExists(String name, Directory directoryToSearch, String source) {
        if(source.equals("file")){
            for (FileSystem file : directoryToSearch.getFileSystems()) {
                if (file.getName().equals(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean fileExists(String name) {
        return fileSystemExists(name, this, "file");
    }

    public boolean directoryExists(String name) {
        return fileSystemExists(name, this, "dir");
    }


    public List<FileSystem> getFileSystems() {
        return fileSystems;
    }

    public Directory getParent() {
        return parent;
    }
}

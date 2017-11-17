package com.task.chapter3.task12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String path;
    List<File> files = new ArrayList<>();

    public Directory(String path){
        this.path = path;
    }


    public List<File> allFiles() {
            File file = new File(path);
            for(File fileFromList : file.listFiles()){
                files.add(fileFromList);
            }
            files.sort((o1, o2) -> {
                if(o1.isDirectory() && o2.isDirectory()){
                    return o1.toString().compareTo(o2.toString());
                }
                if(o1.isDirectory()){
                    return -1;
                }
                if(o2.isDirectory()){
                    return 1;
                }
                return o1.toString().compareTo(o2.toString());
            });

            return files;

    }


}

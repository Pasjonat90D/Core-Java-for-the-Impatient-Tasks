package com.task.chapter3.task11;

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


    public List<File> allFiles(String extension) throws IOException {
            File file = new File(path);
            for(String fileFromList : file.list((dir, name) ->  extension.equals(getFileExtension(name)))){
                files.add(new File(fileFromList));
            }
            return files;

    }


    private String getFileExtension(String file){
        int i = file.lastIndexOf('.');
        if (i >= 0) {
            return new String(file.substring(i+1));
        }
        return null;

    }






}

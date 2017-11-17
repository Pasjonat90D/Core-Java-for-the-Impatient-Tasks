package com.task.chapter3.task10;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String path;
    List<File> folders = new ArrayList<>();

    public Directory(String path){
        this.path = path;
    }


    public List<File> allDirectories() throws IOException {
            listFilesForFolder(new File(path));
            return folders;
//        in Java8
//        try (Stream<Path> paths = Files.walk(Paths.get(path))) {
//            paths.filter(Files::isDirectory).forEach(e -> folder.add(e.toFile()));
//        }
    }


    public void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles(pathname -> pathname.isDirectory())) {
                folders.add(fileEntry);
                listFilesForFolder(fileEntry);

        }
    }

    public void listFilesForFolder2(final File folder) {
        for (final File fileEntry : folder.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        })) {
            folders.add(fileEntry);
            listFilesForFolder(fileEntry);

        }
    }

}

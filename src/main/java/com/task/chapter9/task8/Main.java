package com.task.chapter9.task8;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter9\\task8" +
                "\\files";
        try {
            copyToZip(fileString);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private static void copyToZip(String filePath) throws IOException, URISyntaxException {
        Path zipPath = Paths.get("\\files.zip");
        URI uri = URI.create("jar:" + zipPath.toUri().toString());
        System.out.println(uri);
        Stream<Path> files = Files.walk(Paths.get(filePath));
        FileSystem zipfs = FileSystems.newFileSystem(uri, Collections.singletonMap("create", "true"));

        List<Path> listPath = files.skip(1).collect(Collectors.toList());

        Path source = Paths.get("h:\\").relativize(Paths.get("H:\\Tłumaczenia\\Kissshot.docx"));

        Path target = Paths.get(filePath).relativize(listPath.get(1));

        Files.copy(Paths.get("\\" + source), zipfs.getPath("\\" + target.toString()));


    }

}

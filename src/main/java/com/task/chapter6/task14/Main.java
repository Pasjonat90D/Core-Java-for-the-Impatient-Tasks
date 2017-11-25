package com.task.chapter6.task14;

import java.util.ArrayList;

public class Main {


    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception {
        boolean isException = false;
        for (T elem : elems) {
            try {
                elem.close();
            } catch (Exception e) {
                isException = true;
            }
        }
        if (isException)
            throw new Exception("Error Closable");
    }
}

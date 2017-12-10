package com.task.chapter9.task13;

import java.io.*;

public class Main {

    public static Object copy(final Serializable obj) throws IOException, ClassNotFoundException {
        ObjectOutputStream out = null;
        ObjectInputStream in = null;
        Object copy = null;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            out = new ObjectOutputStream(outputStream);
            out.writeObject(obj);
            out.flush();

            byte data[] = outputStream.toByteArray();
            ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
            in = new ObjectInputStream(inputStream);
            copy = in.readObject();
        } finally {
            out.close();
            in.close();
        }

        return copy;
    }

}

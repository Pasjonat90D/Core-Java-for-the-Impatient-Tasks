package com.task.chapter9.task14;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileString = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter9\\task14\\file";


        Point[] points = {
                new Point(1.1, 1.2),
                new Point(2.1, 2.2),
                new Point(3.1, 3.2),
                new Point(4.1, 4.2)};

        write(points, fileString);
        Point[] pointsFromFile = read(fileString);


        for (Point p : pointsFromFile) {
            System.out.println(p.getX() + " " + p.getY());
        }
    }

    private static Point[] read(String fileString) {
        List<Point> points = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(Paths.get(fileString)))) {
            Point point = null;
            while ((point = (Point) inputStream.readObject()) != null) {
                points.add(point);
            }

        } catch (EOFException exc) {

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return points.toArray(new Point[]{});
    }

    private static void write(Point[] points, String fileString) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileString)))) {
            for (Point p : points) {
                outputStream.writeObject(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

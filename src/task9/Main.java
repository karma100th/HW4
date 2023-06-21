package task9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Box box1 = new Box(1, 2, 3);
        Box box2 = new Box(1, 8, 3);
        Box box3 = new Box(1, 2, 3);
        Box box4 = new Box(1, 5, 3);
        Box box5 = new Box(1, 2, 3);
        FileOutputStream boxesFos = new FileOutputStream("C:\\Users\\vasya\\IdeaProjects\\Homework4\\src\\task9\\boxes");
        ObjectOutputStream boxesOos = new ObjectOutputStream(boxesFos);
        Box[] boxes = {box1, box2, box3, box4, box5};
        boxesOos.writeObject(boxes);
        boxesFos.close();
        boxesOos.close();
    }
}

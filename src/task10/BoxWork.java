package task10;

import task9.Box;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileWriter;
import java.util.Arrays;

public class BoxWork {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream boxFis = new FileInputStream("C:\\Users\\vasya\\IdeaProjects\\Homework4\\src\\task9\\boxes");
        ObjectInputStream boxOis = new ObjectInputStream(boxFis);
        Box[] boxes = (Box[]) boxOis.readObject();
        boxFis.close();
        boxOis.close();
        System.out.println(Arrays.toString(boxes));
        int maxVolume = boxes[0].getVolume();
        for (Box boxElement : boxes) {
            if (boxElement.getVolume() > maxVolume) {
                maxVolume = boxElement.getVolume();
            }
        }
        File file = new File("C:\\Users\\vasya\\IdeaProjects\\Homework4\\src\\task10\\OUTPUT");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(Integer.toString(maxVolume));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

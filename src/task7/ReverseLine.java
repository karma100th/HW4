package task7;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseLine {
    public static void main(String[] args) {
        List<String> inputString = readFromFileToLine("C:\\Users\\vasya\\IdeaProjects\\Homework4\\src\\task7\\INPUT");
        List<String> outputLine = Arrays.asList(inputString.get(0).split("\\s+"));
        Collections.reverse(outputLine);
        writeIntoTheFile(outputLine, "C:\\Users\\vasya\\IdeaProjects\\Homework4\\src\\task7\\OUTPUT");
    }
    public static void writeIntoTheFile(List<String> outputLine, String pathOutput) {
        String output = String.join(" ", outputLine);
        try {
            Files.write(Paths.get(pathOutput), output.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<String> readFromFileToLine(String pathInput) {
        List<String> inputString;
        try {
            inputString = Files.readAllLines(
                    Paths.get(pathInput),
                    StandardCharsets.UTF_8
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return inputString;
    }
}

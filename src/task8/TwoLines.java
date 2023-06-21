package task8;

import task7.ReverseLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TwoLines {
    public static void main(String[] args) {
        List<String> input1 = Arrays.asList(ReverseLine.readFromFileToLine(
                "C:\\Users\\vasya\\IdeaProjects\\Homework4\\src\\task8\\INPUT_1").get(0).split("[\\s+\\p{Punct}\\n]")
        );
        System.out.println(input1);
        List<String> input2 = Arrays.asList(ReverseLine.readFromFileToLine(
                "C:\\Users\\vasya\\IdeaProjects\\Homework4\\src\\task8\\INPUT_2").get(0).split("[\\s+\\p{Punct}\\n]")
        );
        List<String> outputLine = getEqualsStringElementsList(input1, input2);
        ReverseLine.writeIntoTheFile(outputLine, "C:\\Users\\vasya\\IdeaProjects\\Homework4\\src\\task8\\OUTPUT");
    }
    //поздно уточнять про повторы, поэтому сделал метод с ArrayList
    private static List<String> getEqualsStringElementsList(List<String> ferstList, List<String> secondList) {
        List<String> res = new ArrayList<>();
        for (String bigListElement : ferstList) {
            for (String smallListElement : secondList) {
                if (bigListElement.equals(smallListElement)) {
                    res.add(bigListElement);
                }
            }
        }
        return res;
    }
}

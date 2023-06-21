package task3;

import task2.ArithmeticAverage;

import java.util.*;
import java.util.regex.Pattern;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(accumulateNumbersEnteredInConsole());
    }
    private static ArrayList<Integer> accumulateNumbersEnteredInConsole() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^-?\\d+$");
        while (true) {
            System.out.println("Введите целое число или слово \"stop\": ");
            String value = scanner.nextLine();
            if (pattern.matcher(value).find()) {
                numbers.add(Integer.parseInt(value));
            } else if (value.equalsIgnoreCase("status")) {
                Collections.sort(numbers);
                System.out.println(numbers);
            } else if (value.equalsIgnoreCase("stop")) {
                scanner.close();
                break;
            }
        }
        return numbers;
    }
}

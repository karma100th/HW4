package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ArithmeticAverage {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(accumulateNumbersEnteredInConsole());
        System.out.println("Среднее арифметическое чисел: " + numbers + " равно: " + getAverage(numbers));
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
            } else if (value.equalsIgnoreCase("stop")) {
                scanner.close();
                break;
            }
        }
        return numbers;
    }

    public static double getAverage(List<Integer> numbers) {
        double sum = 0;
        for (Integer numbersElement : numbers) {
            sum += numbersElement;
        }
        return sum / numbers.size();
    }
}

package task1;

import java.util.Scanner;

public class StringLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку:");
            System.out.println(scanner.nextLine());
        }
    }
}

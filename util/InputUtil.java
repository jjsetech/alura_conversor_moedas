package util;

import java.util.Scanner;

public class InputUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= min && value <= max) {
                    return value;
                }
            }
            System.out.println("Entrada inválida. Tente novamente.");
            scanner.nextLine(); // limpa buffer
        }
    }

    public static double readDouble(String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }
            System.out.println("Número inválido. Tente novamente.");
            scanner.nextLine(); // limpa buffer
        }
    }
}

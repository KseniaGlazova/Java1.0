package OOPCalc;

import java.io.IOException;
import java.util.Scanner;

public class Numbers {
    public static double getNumber() throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи дробное число: ");
        if (s.hasNextDouble()) {
            return s.nextDouble();
        } else {
            System.out.println("Ошибка ввода. Убедись, что ты правильно ввел число.");
            return getNumber();
        }
    }
}

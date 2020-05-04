package OOPCalc;

import java.io.IOException;

public class Calc {
    public static void main(String[] args) {
        try{
            double num1 = Numbers.getNumber();
            double num2 = Numbers.getNumber();
            char operation = Operations.getOperation();
            double result = Count.calc(num1, num2, operation);
            System.out.printf("Результат: %.4f", result);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("А не делил ли ты на 0?");
        }


    }
}

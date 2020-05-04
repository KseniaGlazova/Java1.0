package OOPCalc;

import java.util.Scanner;

public class Operations {
    public static char getOperation(){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите номер операции:\n 1 - сложение \n 2 - вычитание \n 3 - умножение \n 4 - деление");
        int operationNumber = 0;
        if (s.hasNextInt()){
            operationNumber = s.nextInt();
        }else {
            System.out.println("Введите числа от 1 до 4!");
            return getOperation();
        }
        switch (operationNumber){
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Неправильная операция! Введите числа от 1 до 4!");
                return getOperation();
        }
    }

    /**
     * @param num1
     * @param num2
     * @return num1 + num2
     */
    public static double add(double num1, double num2){ //описывает операцию сложения
        return num1 + num2;
    }

    /**
     * @param num1
     * @param num2
     * @return num1-num2
     */
    public static double sub (double num1, double num2){ //описывает операцию вычитания
        return num1-num2;
    }
    /**
     * @param num1
     * @param num2
     * @return num1*num2
     */
    public static double mul (double num1, double num2){ //описывает операцию умножения
        return num1*num2;
    }
    /**
     * @param num1
     * @param num2
     * @return num1/num2
     */
    public static double div (double num1, double num2){ //описывает операцию деления
        if (num2 == 0){
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return num1/num2;
    }
}

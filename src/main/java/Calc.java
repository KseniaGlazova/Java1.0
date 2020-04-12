/**
 * Реализуем первый калькулятор
 ** @author Ksenia Glazova
 */
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.printf("Результат: %.4f", result);
    }
/*Вводим числа для последующих операций*/
        public static double getNumber(){
            Scanner s = new Scanner(System.in);
            System.out.println("Введи дробное число: ");
            if (s.hasNextDouble()) {
                return s.nextDouble();
            } else {
                System.out.println("Ошибка ввода. Убедись, что ты правильно ввел число.");
                return getNumber();
            }
        }
/*Выбираем операцию*/
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
            return num1/num2;
        }

    /**
     * @param num1
     * @param num2
     * @param operation
     * @return operation, depends of written charachter, default returns Double.Nan
     */

/*Проводим операцию в калькуляторе*/
        public static double calc(double num1, double num2, char operation){
            switch (operation){
                case '+':
                    return add(num1, num2);
                case '-':
                    return sub(num1, num2);
                case '*':
                    return mul(num1, num2);
                case '/':
                    return div(num1, num2);
                default: return Double.NaN;
            }
        }
}

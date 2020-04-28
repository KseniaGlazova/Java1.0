package OOPCalc;

public class Calc {
    public static void main(String[] args) {
        double num1 = Numbers.getNumber();
        double num2 = Numbers.getNumber();
        char operation = Operations.getOperation();
        double result = Count.calc(num1, num2, operation);
        System.out.printf("Результат: %.4f", result);


    }
}

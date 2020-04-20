import java.util.Scanner;

public class ProgrammChoice {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Выбираем, что хотим сделать. \n 1 - калькулятор \n 2 - находим самое длинное число в массиве");
        int choice = s.nextInt();
        if (choice == 1){
            Calc calc = new Calc();
            calcCall();
        }else{
          ArrayForChoice.array();
        }
    }

    public static double calcCall(){

        double num1 = Calc.getNumber();
        double num2 = Calc.getNumber();
        char operation = Calc.getOperation();
        double result = Calc.calc(num1, num2, operation);
        System.out.printf("Результат: %.4f", result);

        return result;
    }
}


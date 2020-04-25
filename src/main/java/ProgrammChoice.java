import java.util.Scanner;

public class ProgrammChoice {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Выбираем, что хотим сделать. \n 1 - калькулятор \n 2 - находим самое длинное слово в массиве");
        int choice = s.nextInt();
        if (choice == 1){
            Calc calc = new Calc();
            calcCall();
        }else if(choice == 2){
          ArrayForChoice.array();
        }else{
            System.out.println("Ты ввел неправильное число");
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


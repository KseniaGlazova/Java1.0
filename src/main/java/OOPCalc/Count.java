package OOPCalc;

import static OOPCalc.Operations.*;

public class Count {
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

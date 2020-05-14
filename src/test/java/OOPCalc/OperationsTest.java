package OOPCalc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsTest {

    @Test
    public void add() {
        Calc calc = new Calc();
        double res = Operations.add(2.0, 3.0);
        Assert.assertEquals(5, res, 0);
    }

    @Test
    public void sub() {
        Calc calc = new Calc();
        double res = Operations.sub(9.6, 4.3);
        Assert.assertEquals(5.3, res, 0);
    }


    @Test
    public void mul() {
        Calc calc = new Calc();
        double res = Operations.mul(8.1, 4.3);
        Assert.assertEquals(34.83, res, 0);
    }

    @Test
    public void div() {
        Calc calc = new Calc();
        double res = Operations.div(100.0, 2.0);
        Assert.assertEquals(50, res, 0);
    }

    @Test(expected=java.lang.ArithmeticException.class)
    public void divByZero() {
        Calc calc = new Calc();
        double res = Operations.div(5.0, 0);
        Assert.fail();
    }
}
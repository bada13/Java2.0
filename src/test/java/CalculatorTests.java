import org.junit.Assert;
import org.junit.Test;
import Task5.CalculatorCalculations;

public class CalculatorTests {

    @Test
    public void simpleAddition(){
        CalculatorCalculations calc = new CalculatorCalculations();
        Assert.assertEquals("При сложении 1 и 1 будет 2",2,calc.Addition(1,1),0);
    }

    @Test
    public void additionByZero(){
        CalculatorCalculations calc = new CalculatorCalculations();
        Assert.assertEquals("При сложении 1 и 0 будет 1",1,calc.Addition(1,0),0);
    }

    @Test
    public void simpleSubtraction(){
        CalculatorCalculations calc = new CalculatorCalculations();
        Assert.assertEquals("При вычетание из 1 1 будет 0",0,calc.Subtraction(1,1),0);
    }

    @Test
    public void subtractionFromZero(){
        CalculatorCalculations calc = new CalculatorCalculations();
        Assert.assertEquals("При вычетание из 0 1 будет -1",-1,calc.Subtraction(0,1),0);
    }

    @Test
    public void simpleMultiplication(){
        CalculatorCalculations calc = new CalculatorCalculations();
        Assert.assertEquals("При множении 2 на 2 будет 4",4,calc.Multiplication(2,2),0);
    }

    @Test
    public void multiplicationByZero(){
        CalculatorCalculations calc = new CalculatorCalculations();
        Assert.assertEquals("При множении на 0 будет 0",0,calc.Multiplication(1,0),0);
    }

    @Test
    public void simpleDivision(){
        CalculatorCalculations calc = new CalculatorCalculations();
        Assert.assertEquals("При деление 4 на 2 будет 2",2,calc.Division(4,2),0);
    }

    @Test
    public void divisionByZeroPOSITIVE(){
        CalculatorCalculations calc = new CalculatorCalculations();
        Assert.assertEquals("Делить на 0 нельзя, первое число положительное",Double.POSITIVE_INFINITY,calc.Division(1,0),0);
    }

    @Test
    public void divisionByZeroNEGATIVE(){
        CalculatorCalculations calc = new CalculatorCalculations();
        Assert.assertEquals("Делить на 0 нельзя, первое число отрицательное",Double.NEGATIVE_INFINITY,calc.Division(-1,0),0);
    }
}

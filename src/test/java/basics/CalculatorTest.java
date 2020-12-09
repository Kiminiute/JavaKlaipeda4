package basics;
import fundamentals_testing.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public  void testAdd(){
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.add(2,4);
        //then
        assertEquals(6, result);
    }
    @Test
    public void testDivision(){
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.divide(10,5);
        // then
        assertEquals(2, result);

    }
    @Test
    public void testMultiplikaction(){
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.multiplication(10,5);
        // then
        assertEquals(50, result);

    }
    @Test
    public void testSubtraction(){
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.subtraction(10,5);
        // then
        assertEquals(5, result);

    }

}

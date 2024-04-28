package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.exeption.ZeroDividerException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {
    private CalculatorService service = new CalculatorServiceImpl();

    @Test
    public void shouReturnValidResultWhenSumTwoNumbers() {

        int result = service.sum(6, 4);
        assertEquals(10, result);
        int result2 = service.sum(4, 4);
        assertEquals(8, result2);
    }

    @Test
    public void shouReturnValidResultWhenMinusTwoNumbers() {

        int result = service.minus(6, 4);
        assertEquals(2, result);
        int result2 = service.minus(4, 4);
        assertEquals(0, result2);
    }

    @Test
    public void shouReturnValidResultWhenMultiplyTwoNumbers() {

        int result = service.multiply(6, 4);
        assertEquals(24, result);
        int result2 = service.multiply(4, 4);
        assertEquals(16, result2);
    }


    @Test
    public void shouReturnValidResultWhenDivideTwoNumbers() {

        int result = service.divide(6, 3);
        assertEquals(2, result);
        int result2 = service.divide(6, 2);
        assertEquals(3, result2);
        assertThrows(ZeroDividerException.class, () -> service.divide(1, 0));

    }
}

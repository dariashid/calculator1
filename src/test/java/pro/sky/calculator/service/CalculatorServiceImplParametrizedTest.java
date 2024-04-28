package pro.sky.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParametrizedTest {
    private CalculatorService service = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("dataSourceForSumTest")
    public void shouReturnValidResultWhenSumTwoNumbers(int num1, int num2, int expected) {
        int result = service.sum(num1, num2);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> dataSourceForSumTest() {
        return Stream.of(Arguments.of(1, 1, 2), Arguments.of(2, 2, 4), Arguments.of(3, 3, 6));
    }

    @ParameterizedTest
    @MethodSource("dataSourceForMinusTest")
    public void shouReturnValidResultWhenMinusTwoNumbers(int num1, int num2, int expected) {
        int result = service.minus(num1, num2);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> dataSourceForMinusTest() {
        return Stream.of(Arguments.of(1, 1, 0), Arguments.of(3, 2, 1), Arguments.of(4, 3, 1));
    }

    @ParameterizedTest
    @MethodSource("dataSourceForMultiplyTest")
    public void shouReturnValidResultWheMultiplyTwoNumbers(int num1, int num2, int expected) {
        int result = service.multiply(num1, num2);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> dataSourceForMultiplyTest() {
        return Stream.of(Arguments.of(2, 2, 4), Arguments.of(3, 3, 9), Arguments.of(5, 5, 25));
    }

    @ParameterizedTest
    @MethodSource("dataSourceForDivideTest")
    public void shouReturnValidResultWhenDivideTwoNumbers(int num1, int num2, int expected) {
        int result = service.divide(num1, num2);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> dataSourceForDivideTest() {
        return Stream.of(Arguments.of(6, 2, 3), Arguments.of(8, 2, 4), Arguments.of(21, 3, 7));

    }
}

package de.commsult.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorImplTest {

	Calculator formula;

    @BeforeEach
    void setup() {
        //TODO set the class to test!
        formula = new CalculatorImpl();
    }

    void testAddition() {
        double result = formula.calculate("3 + 4");
        System.out.println(result);
        Assertions.assertEquals(7, result, 0);
    }

    void testAddition2() {
        double result = formula.calculate("3 + 4 + 5");
        System.out.println(result);
        Assertions.assertEquals(12, result, 0);
    }
    
    void testAddition3() {
        double result = formula.calculate("3.6 + 4.41");
        System.out.println(result);
        Assertions.assertEquals(8.01, result, 0);
    }

    void testAdditionWithNegativeNumber() {
        double result = formula.calculate("3 + -2");
        System.out.println(result);
        Assertions.assertEquals(1, result, 0);
    }

    void testSubtraction() {
        double result = formula.calculate("6 - 4");
        System.out.println(result);
        Assertions.assertEquals(2, result, 0);
    }

    void testSubtraction2() {
        double result = formula.calculate("6 - 4 - 1");
        System.out.println(result);
        Assertions.assertEquals(1, result, 0);
    }

    void testSubtractionNegative() {
        double result = formula.calculate("4 - 6");
        System.out.println(result);
        Assertions.assertEquals(-2, result, 0);
    }

    void testSubtractionNegative2() {
        double result = formula.calculate("4 - 6 - 3");
        System.out.println(result);
        Assertions.assertEquals(-5, result, 0);
    }

    void testMultiplication() {
        double result = formula.calculate("3 * 8");
        System.out.println(result);
        Assertions.assertEquals(24, result, 0);
    }

    void testMultiplication2() {
        double result = formula.calculate("3 * 8 * 2");
        System.out.println(result);
        Assertions.assertEquals(48, result, 0);
    }

    void testMultiplicationNegative() {
        double result = formula.calculate("3 * 8 * -2");
        System.out.println(result);
        Assertions.assertEquals(-48, result, 0);
    }

    void testDivision() {
        double result = formula.calculate("12 / 3");
        System.out.println(result);
        Assertions.assertEquals(4, result, 0);
    }

    void testDivision2() {
        double result = formula.calculate("12 / 3 / 2");
        System.out.println(result);
        Assertions.assertEquals(2, result, 0);
    }

    void testDivisionNegative() {
        double result = formula.calculate("12 / 3 / -2");
        System.out.println(result);
        Assertions.assertEquals(-2, result, 0);
    }

    void testDivisionDecimalResult() {
        double result = formula.calculate("12 / 5");
        System.out.println(result);
        Assertions.assertEquals(2.4, result, 0);
    }

    void testMixed1a() {
        double result = formula.calculate("4 * 10 + 3");
        System.out.println(result);
        Assertions.assertEquals(43, result, 0);
    }

    void testMixed1b() {
        double result = formula.calculate("3 + 4 * 10 ");
        System.out.println(result);
        Assertions.assertEquals(43, result, 0);
    }

    void testMixed2a() {
        double result = formula.calculate("16 + 4/2");
        System.out.println(result);
        Assertions.assertEquals(18, result, 0);
    }

    void testMixed2b() {
        double result = formula.calculate("4 / 2 + 16");
        System.out.println(result);
        Assertions.assertEquals(18, result, 0);
    }

    void testMixed2c() {
        double result = formula.calculate("16 - 4 / 2");
        System.out.println(result);
        Assertions.assertEquals(14, result, 0);
    }

    void testMixed2d() {
        double result = formula.calculate("4 / 2 - 16");
        System.out.println(result);
        Assertions.assertEquals(-14, result, 0);
    }

    void testMixedBracket() {
        double result = formula.calculate("( 3 + 4 ) * 10 ");
        System.out.println(result);
        Assertions.assertEquals(70, result, 0);
    }

    void testMixedBracket2() {
        double result = formula.calculate("( 3 + 4 ) * 10 / 5");
        System.out.println(result);
        Assertions.assertEquals(14, result, 0);
    }

    @Test
    void testMixedBracket3() {
        double result = formula.calculate("( 3 + 4 ) * ( 10 / 5 + 1) - 11");
        System.out.println(result);
        Assertions.assertEquals(10, result, 0);
    }

    void testMixedBracket4() {
        double result = formula.calculate("(3 + (1 + (1 + 1 / 2) + (2 * 1 / 4 + 1))) * ( 10 / 5 + (1 / 4 + 3 / 4 ) )");
        System.out.println(result);
        Assertions.assertEquals(21, result, 0);
    }

    void testGoogle() {
        double result = formula.calculate("6/2*(1+2)");
        System.out.println(result);
        Assertions.assertEquals(9, result, 0);
    }

    void testGoogle2() {
        double result = formula.calculate("4 + 6 + 9 - 3 * 20 / (4)");
        System.out.println(result);
        Assertions.assertEquals(4, result, 0);
    }

    void testAufgabeWeiredOne() {
        double result = formula.calculate("10--10");
        System.out.println(result);
        Assertions.assertEquals(20, result, 0);
    }

    void testAufgabeWeiredTwo() {
        double result = formula.calculate("1.+1");
        System.out.println(result);
        Assertions.assertEquals(2, result, 0);
    }
}

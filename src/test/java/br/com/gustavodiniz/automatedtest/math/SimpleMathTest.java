package br.com.gustavodiniz.automatedtest.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath class")
class SimpleMathTest {

    //[System Under Test][Condition or Stage Change][Expected Result] sumWhenSixDotTwoIsAddedByTwoShouldReturnEightDotTwo
    //[System Under Test][Expected Result][Condition or Stage Change] sumShouldReturnEightDotTwoWhenSixDotTwoIsAddedByTwo

    @Test
    @DisplayName("Sum when 6.2 is added by 2 should return 8.2")
    void sumShouldReturnEightDotTwoWhenSixDotTwoIsAddedByTwo() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.sum(firstNumber, secondNumber);
        double expected = 8.2D;

        assertEquals(expected, actual, "The sum method should return the sum of two numbers");
        assertNotEquals(0, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Subtraction when 6.2 is subtracted by 2 should return 4.2")
    void subtractionShouldReturnFourDotTwoWhenSixDotTwoIsSubtractedByTwo() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;

        assertEquals(expected, actual, "The subtraction method should return the subtraction of two numbers");
        assertNotEquals(0, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Multiplication when 6.2 is multiplied by 2 should return 12.4")
    void multiplicationShouldReturnTwelveDotFourWhenSixDotTwoIsMultipliedByTwo() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;

        assertEquals(expected, actual, "The multiplication method should return the multiplication of two numbers");
        assertNotEquals(0, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Division when 6.2 is divided by 2 should return 3.1")
    void divisionShouldReturnThreeDotOneWhenSixDotTwoIsDividedByTwo() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.division(firstNumber, secondNumber);
        double expected = 3.1D;

        assertEquals(expected, actual, "The division method should return the division of two numbers");
        assertNotEquals(0, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Division when 6.2 is divided by 0 should return Infinity")
    void divisionShouldReturnInfinityWhenFirstNumberIsDividedByZero() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 0D;
        Double actual = math.division(firstNumber, secondNumber);

        assertEquals(Double.POSITIVE_INFINITY, actual, "The division method should return the division of two numbers");
    }

    @Test
    @DisplayName("Mean when 6.2 and 2 is calculated should return 4.1")
    void meanShouldReturnFourDotOneWhenAverageOfSixDotTwoAndTwoIsCalculated() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 4.1D;

        assertEquals(expected, actual, "The mean method should return the mean of two numbers");
        assertNotEquals(0, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Square root when 9 is calculated should return 3")
    void squareRootShouldReturnThreeWhenSquareRootOfNineIsCalculated() {
        SimpleMath math = new SimpleMath();
        double number = 9D;
        Double actual = math.squareRoot(number);
        double expected = 3D;

        assertEquals(expected, actual, "The squareRoot method should return the square root of a number");
        assertNotEquals(0, actual);
        assertNotNull(actual);
    }


}
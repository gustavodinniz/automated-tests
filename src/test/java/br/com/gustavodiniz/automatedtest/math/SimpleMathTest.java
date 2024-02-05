package br.com.gustavodiniz.automatedtest.math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath class")
class SimpleMathTest {

    //[System Under Test][Condition or Stage Change][Expected Result] sumWhenSixDotTwoIsAddedByTwoShouldReturnEightDotTwo
    //[System Under Test][Expected Result][Condition or Stage Change] sumShouldReturnEightDotTwoWhenSixDotTwoIsAddedByTwo

    private SimpleMath math;

    private double firstNumber;

    private double secondNumber;

    private double expectedNumber;

    private Double actual;

    @BeforeAll
    static void setUp() {
        System.out.println("Starting @BeforeAll tests");
    }

    @AfterAll
    static void cleanUp() {
        System.out.println("Starting @AfterAll tests");
    }

    @BeforeEach
    void init() {
        System.out.println("Starting @BeforeEach tests");
        math = new SimpleMath();
        givenFirstNumber();
        givenSecondNumber();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Starting @AfterEach tests");
    }

    @Test
    @DisplayName("Sum when 6.2 is added by 2 should return 8.2")
    void sumShouldReturnEightDotTwoWhenSixDotTwoIsAddedByTwo() {
        givenSumExpectedNumber();
        whenMathSumCalled();
        thenExpectMathSumReturnsExpectedNumber();
        thenExpectReturnsNonZero();
        thenExpectReturnsNotNull();
    }


    @Test
    @DisplayName("Subtraction when 6.2 is subtracted by 2 should return 4.2")
    void subtractionShouldReturnFourDotTwoWhenSixDotTwoIsSubtractedByTwo() {
        givenSubtractExpectNumber();
        whenMathSubtractionCalled();
        thenExpectReturnsExpectedNumber();
        thenExpectReturnsNonZero();
        thenExpectReturnsNotNull();
    }


    @Test
    @DisplayName("Multiplication when 6.2 is multiplied by 2 should return 12.4")
    void multiplicationShouldReturnTwelveDotFourWhenSixDotTwoIsMultipliedByTwo() {
        givenMultiplicationExpectedNumber();
        whenMathMultiplicationCalled();
        thenExpectReturnsExpectedNumber();
        thenExpectReturnsNonZero();
        thenExpectReturnsNotNull();
    }


    @Test
    @DisplayName("Division when 6.2 is divided by 2 should return 3.1")
    void divisionShouldReturnThreeDotOneWhenSixDotTwoIsDividedByTwo() {
        givenDivisionExpectedNumber();
        whenMathDivisionCalled();
        thenExpectReturnsExpectedNumber();
        thenExpectReturnsNonZero();
        thenExpectReturnsNotNull();
    }


    @Test
    @DisplayName("Mean when 6.2 and 2 is calculated should return 4.1")
    void meanShouldReturnFourDotOneWhenAverageOfSixDotTwoAndTwoIsCalculated() {
        givenMeanExpectedNumber();
        whenMathMeanCalled();
        thenExpectReturnsExpectedNumber();
        thenExpectReturnsNonZero();
        thenExpectReturnsNotNull();
    }


    @Test
    @DisplayName("Square root when 6.2 is calculated should return 2.48997991928")
    void squareRootShouldReturnThreeWhenSquareRootOfNineIsCalculated() {
        givenSquareRootExpectedNumber();
        whenMathSquareRootCalled();
        thenExpectMathSumReturnsExpectedNumber();
        thenExpectReturnsNonZero();
        thenExpectReturnsNotNull();
    }


    // given

    private void givenSquareRootExpectedNumber() {
        expectedNumber = 2.4899799195977463D;
    }


    private void givenMultiplicationExpectedNumber() {
        expectedNumber = 12.4D;
    }

    private void givenDivisionExpectedNumber() {
        expectedNumber = 3.1D;
    }

    private void givenMeanExpectedNumber() {
        expectedNumber = 4.1D;
    }

    private void givenSubtractExpectNumber() {
        expectedNumber = 4.2D;
    }

    private void givenSumExpectedNumber() {
        expectedNumber = 8.2D;
    }

    private void givenSecondNumber() {
        secondNumber = 2D;
    }

    private void givenFirstNumber() {
        firstNumber = 6.2D;
    }


    // when

    private void whenMathSquareRootCalled() {
        actual = math.squareRoot(firstNumber);
    }

    private void whenMathMultiplicationCalled() {
        actual = math.multiplication(firstNumber, secondNumber);
    }

    private void whenMathDivisionCalled() {
        actual = math.division(firstNumber, secondNumber);
    }

    private void whenMathMeanCalled() {
        actual = math.mean(firstNumber, secondNumber);
    }

    private void whenMathSubtractionCalled() {
        actual = math.subtraction(firstNumber, secondNumber);
    }

    private void whenMathSumCalled() {
        actual = math.sum(firstNumber, secondNumber);
    }


    // then

    private void thenExpectReturnsExpectedNumber() {
        assertEquals(expectedNumber, actual, "The subtraction method should return the subtraction of two numbers");
    }

    private void thenExpectMathSumReturnsExpectedNumber() {
        assertEquals(expectedNumber, actual, "The sum method should return the sum of two numbers");
    }

    private void thenExpectReturnsNonZero() {
        assertNotEquals(0, actual);
    }

    private void thenExpectReturnsNotNull() {
        assertNotNull(actual);
    }


}
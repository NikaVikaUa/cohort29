import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator; // создаем обьект для вызова тестируемого метода

    @BeforeEach     // аннотация @BeforeEach означает, что метод будет выполняться перед каждым тестом
    void init(){
        calculator = new Calculator();
    }

    // given[explainInput]When[what is done]Then[ExpectedResult]
    // givenBothArgumentsAreZeroWhenTheyAreMultipliedThenExpectZero  - один из вариантов названия метода
    @Test // метод помеченный такой аннотацией является тестовым и его можно запускать самостоятельно
    @DisplayName(" Check simple multiplication")
    void testMultiply(){
        assertEquals(4,calculator.multiply(2,2)); // с помощью этой команды происходит сравнение на
                                                                    // равенство ожидаемого результата с фактическим
    }

    @Test
    @DisplayName("Check correct work with zero")
    void testMultiplyWithZero(){
        assertEquals(0,calculator.multiply(0,4));
    }


}
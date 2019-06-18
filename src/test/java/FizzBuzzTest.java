import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @BeforeEach
    void setup() {
        fizzBuzz = new FizzBuzz();
        System.setOut(new PrintStream(outContent));
    }


    @Test
    void divisibleBy5() {
        fizzBuzz.fizzBuzz(5);
        Assertions.assertEquals("Buzz\n", outContent.toString());
    }
    @Test
    void divisibleBy3() {
        fizzBuzz.fizzBuzz(3);
        Assertions.assertEquals("Fizz\n", outContent.toString());
    }
    @Test
    void divisibleBy15() {
        fizzBuzz.fizzBuzz(30);
        Assertions.assertEquals("FizzBuzz\n", outContent.toString());
    }
    @Test
    void returnsNumber() {
        fizzBuzz.fizzBuzz(11);
        Assertions.assertEquals("11\n", outContent.toString());
    }
}

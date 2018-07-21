import Programowanie.zaj3.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFib(){
        assertEquals(1,Fibonacci.fib(2));
        assertEquals(2,Fibonacci.fib(3));
        assertEquals(13,Fibonacci.fib(7));
        assertEquals(144,Fibonacci.fib(12));
        assertEquals(4181,Fibonacci.fib(19));
    }

    @Test
    public void testFib2(){
        assertEquals(1,Fibonacci.fib2(2));
        assertEquals(2,Fibonacci.fib2(3));
        assertEquals(13,Fibonacci.fib2(7));
        assertEquals(144,Fibonacci.fib2(12));
        assertEquals(4181,Fibonacci.fib2(19));
    }
}

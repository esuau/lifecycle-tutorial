package io.esuau.tutorial.business;

import org.junit.Test;
import org.junit.Assert;

public class FibonacciTest {

    @Test
    public void fibonacciReturnsCorrectValues() {
        Assert.assertEquals(1, Fibonacci.fibonacci(1));
        Assert.assertEquals(1, Fibonacci.fibonacci(2));
        Assert.assertEquals(2, Fibonacci.fibonacci(3));
        Assert.assertEquals(3, Fibonacci.fibonacci(4));
        Assert.assertEquals(5, Fibonacci.fibonacci(5));
    }

}

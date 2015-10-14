package com.itrifonov.homework;

import junit.framework.TestCase;

public class Task2Test extends TestCase {

    public void testFibonacci() throws Exception {
        /* 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,
           89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,
           10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040,
           1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169 */

        assertEquals(0L, Task2Activity.fibonacci(0));
        assertEquals(1L, Task2Activity.fibonacci(1));
        assertEquals(1L, Task2Activity.fibonacci(2));
        assertEquals(2L, Task2Activity.fibonacci(3));
        assertEquals(5L, Task2Activity.fibonacci(5));
        assertEquals(21L, Task2Activity.fibonacci(8));
        assertEquals(144L, Task2Activity.fibonacci(12));
        assertEquals(4181L, Task2Activity.fibonacci(19));
        assertEquals(196418L, Task2Activity.fibonacci(27));
        assertEquals(39088169L, Task2Activity.fibonacci(38));
    }

    public void testFactorial() throws Exception {
        /* 0!=1, 1!=1, 2!=2, 3!=6, 4!=24, 5!=120, 6!=720, 7!=5040, 8!=40320, 9!=362880, 10!=3628800,
           11!=39916800, 12!=479001600, 13!=6227020800, 14!=87178291200, 15!=1307674368000, 16!=20922789888000,
           17!=355687428096000, 18!=6402373705728000, 19!=121645100408832000, 20!=2432902008176640000,
           21!=51090942171709440000, 22!=1124000727777607680000 */

        assertEquals(1L, Task2Activity.factorial(0));
        assertEquals(1L, Task2Activity.factorial(1));
        assertEquals(24L, Task2Activity.factorial(4));
        assertEquals(362880L, Task2Activity.factorial(9));
        assertEquals(6227020800L, Task2Activity.factorial(13));
        assertEquals(6402373705728000L, Task2Activity.factorial(18));
    }

}

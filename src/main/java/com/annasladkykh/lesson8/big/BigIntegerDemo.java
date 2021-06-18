package com.annasladkykh.lesson8.big;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        Integer number = Integer.MAX_VALUE;
        System.out.println(number);
        System.out.println(number+1);

        Long biggerNumber = number + 1L;
        System.out.println(biggerNumber);
        Long biggerNumber2 = Long.MAX_VALUE;
        System.out.println(biggerNumber2);
        System.out.println(biggerNumber2 + 1);

        BigInteger bigNumber = BigInteger.valueOf(biggerNumber2);
        BigInteger bigNumber2 = BigInteger.valueOf(biggerNumber2);
        BigInteger result = bigNumber.multiply(bigNumber2);
        System.out.println(result);
    }
}

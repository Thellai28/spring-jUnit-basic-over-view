package com.thellai.junit;

public class MyMath {

    public int calculateSum( int[] numbers ) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public int calculateProduct( int numbers[] ){
        int prod = 1;

        for( int num : numbers ){
            prod *= num;
        }
        return (numbers.length == 0) ? 0 : prod;
    }
}

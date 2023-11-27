package com.thellai.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    MyMath math = new MyMath(); //Create the object of the class :
    @Test
    void calculateSum_ThreeMemberArrayAsInput() { // This name can be anything & return type will mostly void :
       int actualResult = math.calculateSum( new int[]{1,2,3} );
       int expectedResult = 6;
       assertEquals( expectedResult, actualResult);
    }

    @Test
    void calculateSum_zeroMemberArray(){
        assertEquals(0, math.calculateSum(new int[]{}) );
    }

    @Test
    void calculateProduct_ZeroMemberArrayAsInput(){
        assertEquals(0, math.calculateProduct( new int[]{}));
    }

    @Test
    void calculateProduct_FiveMemberArrayAsInput(){
        assertEquals(120, math.calculateProduct( new int[]{1,2,3,4,5}));
    }

}
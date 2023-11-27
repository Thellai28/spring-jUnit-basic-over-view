package com.thellai.junit;

import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {

    @BeforeAll
    static void beforeAllSampelMethod(){
        // this method will be executed before all the test methods & it's madatory to define method with @BeforerAll anotation as static : 
        System.out.println("im before all");
    }
    @AfterAll
    static void afterAllSampelMethod(){
        // This method will be executed after all the test methods & it's madatory to define method with @AfterAll anotation as static : 
        System.out.println("im after all");
    }

    @BeforeEach
    void beforeEachSampleMethod(){
        // methods with @BeforeEach annotatioin will be executed before each test method.
        System.out.println("im before each");
    }

    @AfterEach
    void afterEachSampleMethod(){
        // methods with @Each Afternnotatioin will be executed before each test method.
        System.out.println("im After each");
    }

   @Test
    void test1(){
        System.out.println("test 1 executed : ");
    }

    @Test
    void test2(){
        System.out.println("test 2 executed : ");
    }


    @Test
    void test3(){
        System.out.println("test 3 executed : ");
    }

    @Test
    void test4(){
        System.out.println("test 4 executed : ");
    }

    //<----------------------------------- OUTPUT ---------------------------------------------------> 
    /*
        im before all


        im before each
        test 1 executed : 
        im After each

        im before each
        test 2 executed : 
        im After each

        im before each
        test 3 executed : 
        im After each

        im before each
        test 4 executed : 
        im After each


        im after all

        Process finished with exit code 0
     */
}

package com.example.devops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DecimalFormat;

import static com.example.devops.DevopsApplication.multiplication;

@SpringBootTest
class DevopsApplicationTests {
    @Test
    public void testAddition() {
        double result = DevopsApplication.addition(4,7);
        Assertions.assertEquals(11,result);

    }

    @Test
    public void testSubtraction() {
        double result = DevopsApplication.subtraction(8,4);
        Assertions.assertEquals(4,result);

    }
    @Test
    public void testMultiplication() {
        double result = multiplication(4,7);
        Assertions.assertEquals(28,result);

    }

    @Test
    public void testDivision(){
        double result = DevopsApplication.division(16,4);
        Assertions.assertEquals(4,result);
    }

    @Test
    public void testNaturalLog(){
        double result = DevopsApplication.log(16);
        Assertions.assertEquals(2.772588722239781,result);
    }

    @Test
    public void testSquareroot(){
        double result = DevopsApplication.sqrt(64);
        Assertions.assertEquals(8,result);
    }
    @Test
    public void testFactorial() {
        double result = DevopsApplication.factorial(5);
        Assertions.assertEquals(120,result);
    }
    @Test
    public void testPower() {
        double result = DevopsApplication.power(6,2);
        Assertions.assertEquals(36,result);
    }
    @Test
    public void testNegSubtraction() {
        double result = DevopsApplication.subtraction(200000,233326);
        Assertions.assertEquals(-33326,result);
    }

    @Test
    public void testZeroDivision() {
        double result = DevopsApplication.division(0,2);
        Assertions.assertEquals(0,result);
    }
    @Test
    public void testLog() {
        double result = DevopsApplication.log(1);
        Assertions.assertEquals(0,result);
    }



}


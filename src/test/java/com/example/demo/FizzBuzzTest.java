package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testcase001_say_1_when_input_1(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actualResult = fizzbuzz.get(1);
        assertEquals("1", actualResult);
    }
    @Test
    public void testcase002_say_2_when_input_2(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actualResult = fizzbuzz.get(2);
        assertEquals("2", actualResult);
    }
    @Test
    public void testcase003_say_Fizz_when_input_3(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actualResult = fizzbuzz.get(3);
        assertEquals("Fizz", actualResult);
    }
    @Test
    public void testcase004_say_4_when_input_4(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actualResult = fizzbuzz.get(4);
        assertEquals("4", actualResult);
    }
    @Test
    public void testcase005_say_Buzz_when_input_5(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actualResult = fizzbuzz.get(5);
        assertEquals("Buzz", actualResult);
    }
    @Test
    public void testcase006_say_Fizz_when_input_6(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actualResult = fizzbuzz.get(6);
        assertEquals("Fizz", actualResult);
    }
    @Test
    public void testcase007_say_7_when_input_7(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actualResult = fizzbuzz.get(7);
        assertEquals("7", actualResult);
    }
    @Test
    public void testcase008_say_8_when_input_8(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actualResult = fizzbuzz.get(8);
        assertEquals("8", actualResult);
    }
    @Test
    public void testcase009_say_Fizz_when_input_9(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actualResult = fizzbuzz.get(9);
        assertEquals("Fizz", actualResult);
    }
    @Test
    public void testcase010_say_Buzz_when_input_10(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actualResult = fizzbuzz.get(10);
        assertEquals("Buzz", actualResult);
    }
    @Test
    public void testcase011_say_FizzBuzz_when_input_15(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actualResult = fizzbuzz.get(15);
        assertEquals("FizzBuzz", actualResult);
    }

}

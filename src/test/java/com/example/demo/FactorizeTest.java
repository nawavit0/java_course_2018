package com.example.demo;

import org.junit.*;
import static org.junit.Assert.*;

public class FactorizeTest {

    @Test
    public void input_2_output_2() {
        String expected = "[2]";
        String actual = Factorize.answer(2);
        assertEquals(expected, actual);
    }
    @Test
    public void input_3_output_3() {
        String expected = "[3]";
        String actual = Factorize.answer(3);
        assertEquals(expected, actual);
    }
    @Test
    public void input_4_output_2_2() {
        String expected = "[2,2]";
        String actual = Factorize.answer(4);
        assertEquals(expected, actual);
    }
    @Test
    public void input_6_output_2_3() {
        String expected = "[2,2]";
        String actual = Factorize.answer(4);
        assertEquals(expected, actual);
    }
    @Test
    public void input_9_output_3_3() {
        String expected = "[2,2]";
        String actual = Factorize.answer(4);
        assertEquals(expected, actual);
    }
    @Test
    public void input_12_output_2_2_3() {
        String expected = "[2,2]";
        String actual = Factorize.answer(4);
        assertEquals(expected, actual);
    }
    @Test
    public void input_15_output_3_5() {
        String expected = "[2,2]";
        String actual = Factorize.answer(4);
        assertEquals(expected, actual);
    }
}

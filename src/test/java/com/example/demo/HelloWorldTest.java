package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testcase001_hello_somkiat_when_input_is_somkiat(){
        Reception reception = new Reception();
        String actualResult = reception.get("somkiat");
        assertEquals("Hello somkiat", actualResult);
    }
    @Test
    public void testcase002_hello_somchai_when_input_is_somchai(){
        Reception reception = new Reception();
        String actualResult = reception.get("somchai");
        assertEquals("Hello somchai", actualResult);
    }
}

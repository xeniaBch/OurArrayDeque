package task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void inOrderTest(){
        String string = "abbccc";
        assertEquals("a1b2c3", Task2.codeString(string));
        assertEquals("a1b2c3", Task2.codeString2(string));
    }

    @Test
    public void notInOrderTest(){
        String string = "cbbaaa";
        assertEquals("c1b2a3", Task2.codeString(string));
        assertEquals("c1b2a3", Task2.codeString2(string));
    }

    @Test
    public void stringWithSpacesTest(){
        String string = "ccc  ddaa";
        assertEquals("c3 2d2a2", Task2.codeString(string));
        assertEquals("c3 2d2a2", Task2.codeString2(string));
    }

    @Test
    public void emptyStringTest(){
        String string = "";
        assertEquals("", Task2.codeString(string));
        assertEquals("", Task2.codeString2(string));

    }

    @Test
    public void symbolsTest(){
        String string = "!!!ad$$$eeee";
        assertEquals("!3a1d1$3e4", Task2.codeString(string));
        assertEquals("!3a1d1$3e4", Task2.codeString2(string));
    }

    @Test
    public void secondFunctionTest(){
        String string = "aaaR/////aaaaRR";
        assertEquals("a3R1/5a4R2", Task2.codeString2(string));
    }

}
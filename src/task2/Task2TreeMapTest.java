package task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task2TreeMapTest {

    @Test
    public void inOrderTest(){
        String string = "abbccc";
        assertEquals("a1b2c3", Task2TreeMap.codeString(string));
    }


    @Test
    public void emptyStringTest(){
        String string = "";
        assertEquals("", Task2TreeMap.codeString(string));

    }


}
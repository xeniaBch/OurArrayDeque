import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class OurArrayDequeReverseIteratorTest {
    OurArrayDeque ourArrayDeque = new OurArrayDeque<>(10);



    @Test
    public void elementsTest(){
        ourArrayDeque.addLast(5);
        ourArrayDeque.addLast(4);
        ourArrayDeque.addLast(2);
        List<Integer> expected = Arrays.asList(2,4,5);
        List<Integer> actual = new ArrayList<>();
        Iterator <Integer> iterator = new OurArrayDequeReverseIterator<>(ourArrayDeque);
        while (iterator.hasNext()){
            int current = iterator.next();
            actual.add(current);
        }
        System.out.println(actual);
        assertEquals(expected, actual);
    }


    @Test
    public void elementsFirstTest(){
        ourArrayDeque.addFirst(5);
        ourArrayDeque.addFirst(4);
        ourArrayDeque.addFirst(2);
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(4);
        expected.add(2);
        List<Integer> actual = new ArrayList<>();
        Iterator <Integer> iterator = new OurArrayDequeReverseIterator<>(ourArrayDeque);
        while (iterator.hasNext()){
            int current = iterator.next();
            actual.add(current);
        }
        assertEquals(expected, actual);
    }

}
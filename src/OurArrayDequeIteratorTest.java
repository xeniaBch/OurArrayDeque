import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OurArrayDequeIteratorTest {
    OurArrayDeque ourArrayDeque = new OurArrayDeque<>(10);
    OurArrayDequeIterator<Integer> iterator = new OurArrayDequeIterator<>(ourArrayDeque);


    @Test
    public void elementsTest(){
        ourArrayDeque.addLast(5);
        ourArrayDeque.addLast(4);
        ourArrayDeque.addLast(2);
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(4);
        expected.add(2);
        List<Integer> actual = new ArrayList<>();
        while (iterator.hasNext()){
          actual.add(iterator.next());
        }
        assertEquals(expected, actual);
    }


    @Test
    public void elementsFirstTest(){
        ourArrayDeque.addFirst(5);
        ourArrayDeque.addFirst(4);
        ourArrayDeque.addFirst(2);
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(5);
        List<Integer> actual = new ArrayList<>();
        while (iterator.hasNext()){
            actual.add(iterator.next());
        }
        assertEquals(expected, actual);
    }

}
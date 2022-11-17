import org.junit.Test;
import task2.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class OurArrayDequeTest {


    OurArrayDeque<Integer> ourArrayDeque = new OurArrayDeque(10);

    @Test
    public void sizeTest(){
        ourArrayDeque.addLast(5);
        ourArrayDeque.addLast(3);
        ourArrayDeque.addLast(-1);
        ourArrayDeque.addFirst(-7);
        ourArrayDeque.addFirst(6);
        ourArrayDeque.removeLast();
        ourArrayDeque.removeFirst();
        assertEquals(3, ourArrayDeque.size());
    }

    @Test
    public void firstElementTest(){
        ourArrayDeque.addFirst(5);
        ourArrayDeque.addFirst(3);
        ourArrayDeque.addLast(-1);
        assertEquals(3, ourArrayDeque.getFirst());
    }

    @Test
    public void lastElementTest(){
        ourArrayDeque.addLast(5);
        ourArrayDeque.addLast(-2);
        ourArrayDeque.addLast(2);
        ourArrayDeque.addLast(3);
        assertEquals(3, ourArrayDeque.getLast());
    }

//поправила тест, инициализировав итератор
    @Test
    public void iterableTest(){
        ourArrayDeque.addLast(5);
        ourArrayDeque.addLast(-2);
        ourArrayDeque.addLast(2);
        ourArrayDeque.addLast(3);
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(-2);
        expected.add(2);
        expected.add(3);
        List<Integer> actual = new ArrayList<>();
        Iterator<Integer> it = ourArrayDeque.iterator();
        while (it.hasNext()){
            actual.add(it.next());
        }
        assertEquals(expected, actual);
    }

    @Test
    public void iterableAddedFirstTest(){
        ourArrayDeque.addFirst(5);
        ourArrayDeque.addFirst(-2);
        ourArrayDeque.addFirst(2);
        ourArrayDeque.addFirst(3);
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(2);
        expected.add(-2);
        expected.add(5);
        List<Integer> actual = new ArrayList<>();
        Iterator<Integer> it = ourArrayDeque.iterator();
        while (it.hasNext()){
            actual.add(it.next());
        }
        assertEquals(expected, actual);
    }

}
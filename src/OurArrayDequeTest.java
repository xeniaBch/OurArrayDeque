import org.junit.Test;
import task2.Task2;

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


}
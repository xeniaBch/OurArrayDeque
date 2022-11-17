import java.util.Iterator;

public class OurArrayDequeReverseIterator<T> implements Iterator<T> {

    //у меня не получается понять, как сделать обратный итератор
    int currentIndexNumber;
    OurArrayDeque<T> ourArrayDeque;

    public OurArrayDequeReverseIterator(OurArrayDeque<T> ourArrayDeque) {
        this.ourArrayDeque = ourArrayDeque;
        this.currentIndexNumber = (ourArrayDeque.firstElementIndex + ourArrayDeque.size - 1);// % ourArrayDeque.capacity;
    }

    @Override
    public boolean hasNext() {
        return currentIndexNumber > ourArrayDeque.firstElementIndex;
    }

    @Override
    public T next() {
       T res = (T) ourArrayDeque.source[currentIndexNumber];
        currentIndexNumber--;
        return res;
    }
}

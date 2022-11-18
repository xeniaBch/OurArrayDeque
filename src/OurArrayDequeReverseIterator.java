import java.util.Iterator;

public class OurArrayDequeReverseIterator<T> implements Iterator<T> {

    //у меня не получается понять, как сделать обратный итератор
    int currentIndex;
    OurArrayDeque<T> ourArrayDeque;

    public OurArrayDequeReverseIterator(OurArrayDeque<T> ourArrayDeque) {
        this.ourArrayDeque = ourArrayDeque;
        this.currentIndex = (ourArrayDeque.size - 1);
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public T next() {
        int iteratedIndex = (ourArrayDeque.firstElementIndex + currentIndex) % ourArrayDeque.capacity;
        currentIndex--;
        return (T) ourArrayDeque.source[iteratedIndex];
    }
}

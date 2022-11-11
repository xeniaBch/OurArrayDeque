import java.util.Iterator;

public class OurArrayDequeIterator<T> implements Iterator<T> {

    int currentIndexNumber;
    OurArrayDeque<T> ourArrayDeque;// = new OurArrayDeque<>(10);

    public OurArrayDequeIterator(OurArrayDeque<T> ourArrayDeque) {
        this.ourArrayDeque = ourArrayDeque;
        //this.currentIndexNumber = ourArrayDeque.firstElementIndex;
    }

    @Override
    public boolean hasNext() {
        return currentIndexNumber < ourArrayDeque.size();
    }

    @Override
    public T next() {
        int iteratedIndex = (ourArrayDeque.firstElementIndex + currentIndexNumber) % ourArrayDeque.capacity;
        currentIndexNumber++;
        return (T) ourArrayDeque.source[iteratedIndex];
    }
}

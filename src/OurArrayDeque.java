import java.util.Iterator;

public class OurArrayDeque<T> implements OurDeque {

    int firstElementIndex;
    int nextElementIndex;
    int size;
    int capacity ;

    public OurArrayDeque(int capacity) {
        this.capacity = capacity;
        source = new Object[capacity];
    }

    public Object[] getSource() {
        return source;
    }

    Object[] source;

    @Override
    public void addLast(Object elt) {

        if (size == capacity) {
            throw new OurDequeOverflowException();
        }
        nextElementIndex = (firstElementIndex + size) % capacity;
        source[nextElementIndex] = elt;
        size++;
    }

    @Override
    public void addFirst(Object elt) {
        if (size == capacity) {
            throw new OurDequeOverflowException();
        }
        if(firstElementIndex > 0) firstElementIndex--;
        else firstElementIndex = capacity - 1;
        source[firstElementIndex] = elt;
        size++;
    }

    @Override
    public Object removeLast() {
        if (size == 0){
            throw new OurDequeEmptyException();
        }
        Object res = source[(firstElementIndex + size - 1) % capacity];
        size--;
        return res;
    }

    @Override
    public Object removeFirst() {
        if (size == 0){
            throw new OurDequeEmptyException();
        }
        Object res = source[firstElementIndex];
        firstElementIndex = (firstElementIndex++) % capacity;
        size--;
        return res;
    }

    @Override
    public Object getLast() {
        if(size==0) {
            throw new OurDequeEmptyException();
        }
        return source[(firstElementIndex + size - 1) % capacity];
        //return source[size - 1];
    }

    @Override
    public Object getFirst() {
        if(size==0) {
            throw new OurDequeEmptyException();
        }
        return source[firstElementIndex];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new OurDequeIterator();
    }
    class OurDequeIterator implements Iterator<T> {

        int currentIndexNumber;

        @Override
        public boolean hasNext() {
            return currentIndexNumber < size();
        }

        @Override
        public T next() {
            int iteratedIndex = (firstElementIndex + currentIndexNumber) % capacity;
            currentIndexNumber++;
            return (T) source[iteratedIndex];
        }
    }

   /*@Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            int currentIndexNumber;
           @Override
            public boolean hasNext() {
                return currentIndexNumber < size();
            }

            @Override
            public T next() {
                int iteratedIndex = (firstElementIndex + currentIndexNumber) % capacity;
                currentIndexNumber++;
                return (T) source[iteratedIndex];
            }
        };
    }*/


}




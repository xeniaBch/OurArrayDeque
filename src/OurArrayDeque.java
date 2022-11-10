public class OurArrayDeque<T> implements OurDeque{

    int firstElementIndex;
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
        }
        //firstElementIndex = (firstElementIndex + size) % capacity;
        //firstElementIndex = (firstElementIndex + size) / capacity;

        //TODO: need to check
        if(source[firstElementIndex] != null){
            Object temp = source[firstElementIndex];
            source[firstElementIndex++] = temp;
            source[firstElementIndex] = elt;
        }
        source[firstElementIndex] = elt;
        size++;
    }

    @Override
    public void addFirst(Object elt) {
        if (size == capacity) {

        }
        if(firstElementIndex > 0) firstElementIndex--;
        else firstElementIndex = capacity - 1;
        source[firstElementIndex] = elt;
        size++;
    }

    @Override
    public Object removeLast() {
        if (size == 0){

        }
        Object res = source[(firstElementIndex + size - 1) % capacity];
        size--;
        return res;
    }

    @Override
    public Object removeFirst() {
        if (size == 0){

        }
        Object res = source[firstElementIndex];
        firstElementIndex = (firstElementIndex++) % capacity;
        size--;
        return res;
    }

    @Override
    public Object getLast() {
        if(size==0) {
            return null;
        }
        //return source[(firstElementIndex + size - 1) % capacity];
        return source[size - 1];
    }

    @Override
    public Object getFirst() {
        if(size==0) {
            return null;
        }
        return source[firstElementIndex];
    }

    @Override
    public int size() {
        return size;
    }

}

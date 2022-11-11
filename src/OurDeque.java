public interface OurDeque<T> extends Iterable<T>{

    void addLast(T elt);

    void addFirst(T elt);

    T removeLast();

    T removeFirst();

    T getLast();

    T getFirst();

    int size();



}

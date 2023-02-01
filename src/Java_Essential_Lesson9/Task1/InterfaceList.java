package Java_Essential_Lesson9.Task1;

public interface InterfaceList<E> extends Iterable<E>{
    boolean add(E e);
    E get(int index);
    int size();
    void delete(int index);
    boolean add(int index, E element);
}

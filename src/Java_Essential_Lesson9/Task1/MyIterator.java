package Java_Essential_Lesson9.Task1;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

    private T[] objects;
    private int index = 0;

    MyIterator(T[] objects){
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public T next() {
        return objects[index++];
    }
}

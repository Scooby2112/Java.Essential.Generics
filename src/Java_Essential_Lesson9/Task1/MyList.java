package Java_Essential_Lesson9.Task1;

import java.util.Iterator;

public class MyList<T> implements InterfaceList<T> {

    private T[] values;
    public MyList(){
        values = (T[]) new Object[0];
    }

    @Override
    public boolean add(T e) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean add(int index, T element) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[index] = element;
            return true;
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void delete(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElementAfterIndex);
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(values);
    }
}

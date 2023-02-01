package Java_Essential_Lesson9.Task2;

public interface InterfaceDictionary<Tkey,Tvalue> {
    boolean add (Tkey key, Tvalue value);
    Tvalue getValueByKey(Tkey key) throws Exception;
    Tvalue getValueByIndex(int index);
    int size();
}

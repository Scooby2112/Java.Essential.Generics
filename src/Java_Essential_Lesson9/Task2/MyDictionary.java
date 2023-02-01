package Java_Essential_Lesson9.Task2;

import java.util.ArrayList;

public class MyDictionary<Tkey,Tvalue> implements InterfaceDictionary<Tkey,Tvalue> {

    private ArrayList<Tkey> keys = new ArrayList<>();
    private ArrayList<Tvalue> values = new ArrayList<>();

    @Override
    public boolean add(Tkey key, Tvalue value) {
        keys.add(key);
        values.add(value);
        return true;
    }

    @Override
    public Tvalue getValueByKey(Tkey key) throws Exception {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals(key)) return values.get(i);
        }
        throw new Exception("Помилка! Пару ключа <" + key + "> не знайдено");
    }

    @Override
    public int size() {
        return keys.size();
    }
    @Override
    public Tvalue getValueByIndex(int index){
        return values.get(index);
    }

}

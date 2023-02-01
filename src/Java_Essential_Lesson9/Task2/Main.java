package Java_Essential_Lesson9.Task2;

public class Main {
    public static void main(String[] args) throws Exception {
        InterfaceDictionary<String,String> dictionary = new MyDictionary<>();

        dictionary.add("Iphone", "11");
        dictionary.add("Samsung", "S21");
        dictionary.add("Xiaomi", "12");
        dictionary.add("Google", "Pixel");

        System.out.println(dictionary.size());
        System.out.println(dictionary.getValueByKey("Iphone"));
        System.out.println(dictionary.getValueByIndex(3));
    }
}

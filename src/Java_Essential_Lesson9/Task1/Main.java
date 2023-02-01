package Java_Essential_Lesson9.Task1;

public class Main {
    public static void main(String[] args) {
        InterfaceList<String> list = new MyList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println();

        list.delete(1);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println();

        list.add(2, "Four");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}

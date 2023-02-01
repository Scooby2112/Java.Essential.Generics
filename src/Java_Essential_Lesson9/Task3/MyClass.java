package Java_Essential_Lesson9.Task3;

public class MyClass <T>{
    public T field;

    public MyClass(){}

    public MyClass(T field){
        this.field = field;
    }

    public static <S> MyClass<S> factoryMethod(){
        return new MyClass<>();
    }

    public static <S> MyClass<S> factoryMethod(S arg){
        return new MyClass<>(arg);
    }
}

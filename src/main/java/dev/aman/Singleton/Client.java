package dev.aman.Singleton;

public class Client {
    public static void main(String[] args) {
        SingletonClass instance = SingletonClass.getInstance();
        System.out.println(instance);
        //Both instance and instance2 will point to same object
        SingletonClass instance2 = SingletonClass.getInstance();
        System.out.println(instance2);
    }
}

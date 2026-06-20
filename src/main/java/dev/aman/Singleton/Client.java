package dev.aman.Singleton;

public class Client {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //code to be implemented by thread
                SingletonClass instance = SingletonClass.getInstance();
                System.out.println(instance);
            }
        };

        Thread threadOne = new Thread(runnable);
        Thread threadTwo = new Thread(runnable);
        threadOne.start();
        threadTwo.start();
    }
}

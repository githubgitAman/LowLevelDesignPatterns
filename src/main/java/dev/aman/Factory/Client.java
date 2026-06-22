package dev.aman.Factory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        flutter.getUIFactory(PLATFORM.ANDROID);
        System.out.println(flutter);
    }
}

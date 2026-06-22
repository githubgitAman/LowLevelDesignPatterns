package dev.aman.Factory;

public class Flutter {
    void refresh(){
        System.out.println("Flutter refresh");
    }
    public static UIFactory getUIFactory(PLATFORM platform) {
        return UIFactoryFactory.getUIFactory(platform);
    }
}

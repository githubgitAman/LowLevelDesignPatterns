package dev.aman.Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(PLATFORM platform) {
        if(platform.equals(PLATFORM.ANDROID)){
            return new AndroidUIFactory();
        }
        else{
            return new IOSUIFactory();
        }
    }
}

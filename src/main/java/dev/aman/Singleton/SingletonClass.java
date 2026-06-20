package dev.aman.Singleton;

public class SingletonClass {
    private static SingletonClass instance = null;
    //Making constructor private
    private SingletonClass(){

    }
    //Creating get method to create instance
    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
}

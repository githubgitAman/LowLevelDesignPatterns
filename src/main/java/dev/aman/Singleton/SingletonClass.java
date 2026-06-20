package dev.aman.Singleton;

import java.util.concurrent.locks.ReentrantLock;

public class SingletonClass {
    private static final ReentrantLock lock = new ReentrantLock();
    private static SingletonClass instance = null;
    //Making constructor private
    private SingletonClass(){

    }
    //Creating get method to create instance
    public static SingletonClass getInstance(){
        //Double Check Lock for handling concurrency
        if(instance == null){
            lock.lock();
            if(instance == null){
                instance = new SingletonClass();
            }
            lock.unlock();
        }
        return instance;
    }
}

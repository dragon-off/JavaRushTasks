package com.javarush.task.task14.task1421;

/**
 * Created by dragon on 04.05.2018.
 */
public class Singleton {

    private static Singleton instance;

    public static Singleton getInstanse(){
        if(instance==null)
            instance=new Singleton();
        return instance;

    }
    private Singleton(){

    }
}


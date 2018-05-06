package com.javarush.task.task15.task1522;

/**
 * Created by dragon on 05.05.2018.
 */
public class Sun  implements Planet {
    private static Sun instance;

    private Sun(){}

    public static Sun getInstance(){
        if(instance == null){
            instance = new Sun();
        }
        return instance;
    }


}
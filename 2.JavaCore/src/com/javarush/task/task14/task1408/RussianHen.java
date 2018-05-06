package com.javarush.task.task14.task1408;

/**
 * Created by dragon on 04.05.2018.
 */
public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 50;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.RUSSIA
                + ". Я несу "  + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
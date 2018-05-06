package com.javarush.task.task14.task1408;

/**
 * Created by dragon on 04.05.2018.
 */
public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 35;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.UKRAINE
                + ". Я несу "  + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
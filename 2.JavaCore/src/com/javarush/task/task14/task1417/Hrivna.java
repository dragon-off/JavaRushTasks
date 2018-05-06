package com.javarush.task.task14.task1417;

/**
 * Created by dragon on 04.05.2018.
 */
class Hrivna extends Money {

    public Hrivna(double amount) {
        super(amount);
    }

    public String getCurrencyName() {
        return "HRN";
    }
}
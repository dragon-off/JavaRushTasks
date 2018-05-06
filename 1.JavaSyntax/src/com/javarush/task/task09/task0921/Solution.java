package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        LinkedList<Integer> data = new LinkedList<Integer>();
        try {
            Scanner sc = new Scanner(System.in);
            while(true){
                data.add(Integer.parseInt(sc.nextLine()));
            }
        } catch (NumberFormatException e) {
            for(Integer in: data){
                System.out.println(in);
            }
        }

    }
}

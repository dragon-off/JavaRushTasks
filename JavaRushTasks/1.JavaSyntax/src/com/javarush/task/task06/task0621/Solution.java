package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Cat catGrandFather = new Cat(reader.readLine());
        Cat catGrandMother = new Cat(reader.readLine());
        Cat catFather = new Cat(reader.readLine(), null, catGrandFather);
        Cat catMother = new Cat(reader.readLine(), catGrandMother, null);
        Cat catSon = new Cat(reader.readLine(), catMother, catFather);
        Cat catDaughter = new Cat(reader.readLine(), catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentMother, Cat parentFather) {
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }

        @Override
        public String toString() {
            String s = "Cat name is " + name;
            if (parentMother == null)
                s += ", no mother";
            else
                s += (", mother is " + parentMother.name);
            if (parentFather == null)
                s += ", no father";
            else
                s += (", father is " + parentFather.name);
            return s;
        }
    }

}
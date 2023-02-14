package com.lannstark.lec12;

public class Test {

    public static void main(String[] args) {


        // companion object에 이름이 없다면 Companion.newBaby
        Person gilbert = Person.Factroy.newBaby("Gilbert");

        //@JvmStatic
        Person.newBabyV2("KEVIN");

    }

}

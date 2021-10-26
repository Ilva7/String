package com.company;

public class String1 {

    public static void main(String[] args) {
        String[] str = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination" };
        startingWithC(str);
        endingWithE(str);
        lengthFive(str);
        consistFive(str);
        consistTe(str);
    }

    public static void startingWithC(String[] str) {
        System.out.println("Number of values starting with 'C' are: ");
        int valuesWithC = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].startsWith("C")) {
                valuesWithC++;
            }
        }
        System.out.println(valuesWithC);
    }

    public static void endingWithE(String[] str) {
        System.out.println("Number of values ending with 'e' are: ");
        int valuesWithE = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].endsWith("e")) {
                valuesWithE++;
            }
        }
        System.out.println(valuesWithE);
    }

    public static void lengthFive(String[] str) {
        System.out.println("Number of values with length 5 are: ");
        int valuesWithFive = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() == 5) {
                valuesWithFive++;
            }
        }
        System.out.println(valuesWithFive);
    }

    public static void consistFive(String[] str) {
        System.out.println("Number of values consisting 'e': ");
        int consistE = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("e")) {
                consistE++;
            }
        }
        System.out.println(consistE);
    }

    public static void consistTe(String[] str) {
        System.out.println("Does the value consist of subString 'te'?");
        int consistTe = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("te"))
            System.out.println("Yes");
                else{
                System.out.println("No");
            }
        }
    }
    }


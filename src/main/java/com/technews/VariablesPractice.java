package com.technews;

public class VariablesPractice {
    public static void main(String[] args) {
        int num = 10;
        double num_2 = 10.5;
        String str = "string";

        // calculated var sum is a double
        double sum = num + num_2;

        // calculated var concat is a String
        String concat = num + str;

        // value of sum is 20.5
        System.out.println(sum);

        // value of concat is "10string"
        System.out.println(concat);
    }
}

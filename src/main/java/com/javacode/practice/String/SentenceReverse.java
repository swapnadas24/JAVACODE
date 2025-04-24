package com.javacode.practice.String;

public class SentenceReverse {

    public static void main(String[] args) {

        // how are you? => woh era ?uoy

        String x1 = "How are you?";

        String rev = new StringBuilder(x1).reverse().toString();
        String x2[] = rev.split(" ");

        System.out.println(x2[2] + " " + x2[1] + " " + x2[0]);
    }
}

package com.javacode.interviewQuestions;

public class Test {

    public static void main(String[] args) {

        String x = "Swapna Das";

        String x1[] = x.split(" ");
        String x2 = " ";
        char ch;
        String rev = "";

        for (int i = 0; i < x1[1].length(); i++) {

            ch = x1[1].charAt(i);

            rev = ch + rev;

            x2 = Character.toUpperCase(rev.charAt(0)) + rev.substring(1).toLowerCase();
        }
        System.out.println(x1[0] + " " + x2);
    }
}
